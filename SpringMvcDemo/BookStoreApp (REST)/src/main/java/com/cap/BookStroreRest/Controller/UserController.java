package com.cap.BookStroreRest.Controller;

import com.cap.BookStroreRest.DataTransferObject.*;
import com.cap.BookStroreRest.Service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User", description = "User Management APIs")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    @Operation(
            summary = "Register a new user",
            description = "Creates a new user account in the system"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "User created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid user input")
    })
    public ResponseEntity<UserDto> registerUser(
            @RequestBody @Valid UserDto userDto) {

        UserDto createdUser = userService.registerUser(userDto);

        return ResponseEntity.status(201).body(createdUser);
    }


    @PostMapping("/login")
    @Operation(
            summary = "Login user",
            description = "Authenticate user using email and username"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Login successful"),
            @ApiResponse(responseCode = "401", description = "Invalid credentials"),
            @ApiResponse(responseCode = "400", description = "Invalid input data")
    })
    public ResponseEntity<LoginResponseDto> loginUser(
            @RequestBody @Valid LoginRequestDto loginRequestDto) {

        LoginResponseDto response = userService.loginUser(loginRequestDto);

        return ResponseEntity.ok(response);
    }

    @PostMapping("/refresh")
    @ApiResponse(responseCode = "200", description = "Token Refreshed successfully")
    public ResponseEntity<LoginResponseDto> refreshToken(@RequestBody RefreshTokenRequest request){
        LoginResponseDto response = userService.refreshToken(request);
        return ResponseEntity.ok(response);
    }


//    @GetMapping
//    @Operation(
//            summary = "Get all users",
//            description = "Retrieve all users from the system"
//    )
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Users fetched successfully")
//    })
//    public ResponseEntity<List<UserDto>> getAllUsers() {
//
//        return ResponseEntity.ok(userService.getAllUsers());
//    }

    @GetMapping
    @Operation(
            summary = "Get users with pagination",
            description = "Retrieve users with pagination sorted by username"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Users fetched successfully")
    })
    public ResponseEntity<PageResponse<UserDto>> getAllUsers(

            @Parameter(description = "Page number (starts from 0)")
            @RequestParam(defaultValue = "0") int page
    ) {

        return ResponseEntity.ok(
                userService.getAllUsers(page)
        );
    }


    @GetMapping("/{id}")
    @Operation(
            summary = "Get user by ID",
            description = "Retrieve a specific user using their ID"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User found"),
            @ApiResponse(responseCode = "404", description = "User not found")
    })
    public ResponseEntity<UserDto> getUserById(
            @Parameter(description = "ID of the user")
            @PathVariable Long id) {

        return ResponseEntity.ok(userService.getUserById(id));
    }


    @PutMapping("/{id}")
    @Operation(
            summary = "Update user",
            description = "Update user details using user ID"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User updated successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "404", description = "User not found")
    })
    public ResponseEntity<UserDto> updateUser(
            @Parameter(description = "ID of the user to update")
            @PathVariable Long id,
            @RequestBody @Valid UserDto userDto) {

        return ResponseEntity.ok(userService.updateUser(id, userDto));
    }


    @DeleteMapping("/{id}")
    @Operation(
            summary = "Delete user",
            description = "Delete a user using their ID"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User deleted successfully"),
            @ApiResponse(responseCode = "404", description = "User not found")
    })
    public ResponseEntity<String> deleteUser(
            @Parameter(description = "ID of the user to delete")
            @PathVariable Long id) {

        userService.deleteUser(id);

        return ResponseEntity.ok("User deleted successfully");
    }
}