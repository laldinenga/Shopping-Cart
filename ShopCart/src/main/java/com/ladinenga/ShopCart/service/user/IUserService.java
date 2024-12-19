package com.ladinenga.ShopCart.service.user;

import com.ladinenga.ShopCart.dto.UserDto;
import com.ladinenga.ShopCart.model.User;
import com.ladinenga.ShopCart.request.CreateUserRequest;
import com.ladinenga.ShopCart.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}
