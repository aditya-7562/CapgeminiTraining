package com.cap.BookStroreRest.Service;

import com.cap.BookStroreRest.DataTransferObject.*;
import com.cap.BookStroreRest.Entity.User;
import com.cap.BookStroreRest.Repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserService(UserRepository userRepository,
                       ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public UserDto registerUser(UserDto userDto) {

        User user = modelMapper.map(userDto, User.class);

        User savedUser = userRepository.save(user);

        return modelMapper.map(savedUser, UserDto.class);
    }

    public LoginResponseDto loginUser(LoginRequestDto loginRequestDto) {

        User user = userRepository
                .findByEmail(loginRequestDto.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!user.getUsername().equals(loginRequestDto.getUsername())) {
            throw new RuntimeException("Invalid username");
        }

        // Example token generation (replace with your JWT service)
        String accessToken = "";
        String refreshToken = "";

        return new LoginResponseDto(
                refreshToken,
                accessToken,
                user.getEmail(),
                user.getUsername()
        );
    }

//    public List<UserDto> getAllUsers() {
//
//        return userRepository
//                .findAll()
//                .stream()
//                .map(user -> modelMapper.map(user, UserDto.class))
//                .toList();
//    }

    public PageResponse<UserDto> getAllUsers(int page) {

        Pageable pageable = PageRequest.of(
                page,
                10,
                Sort.by("username").ascending()
        );

        Page<User> userPage = userRepository.findAll(pageable);

        List<UserDto> dtoList = userPage.getContent()
                .stream()
                .map(user -> modelMapper.map(user, UserDto.class))
                .toList();

        return new PageResponse<>(
                dtoList,
                userPage.getNumber(),
                userPage.getSize(),
                userPage.getTotalElements(),
                userPage.getTotalPages()
        );
    }

    public UserDto getUserById(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        return modelMapper.map(user, UserDto.class);
    }

    public UserDto updateUser(Long id, UserDto userDto) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());

        User updatedUser = userRepository.save(user);

        return modelMapper.map(updatedUser, UserDto.class);
    }

    public void deleteUser(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        userRepository.delete(user);
    }

    public LoginResponseDto refreshToken(RefreshTokenRequest request) {

    }
}
