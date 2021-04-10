package ru.bellintegrator.practice.view;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ApiModel(description = "Пользователь")
public class UserView {

    @NotEmpty
    @ApiModelProperty(value = "Уникальный идентификатор", hidden = true, example = "1")
    public String id;

    @Size(max = 255)
    @NotEmpty(message = "first name cannot be null")
    @ApiModelProperty(value = "Имя", example = "Иван")
    public String firstName;

    @Size(max = 255)
    @NotEmpty(message = "middle first name cannot be null")
    @ApiModelProperty(value = "Отчество", example = "Иваныч")
    public String middleName;

    @Size(max = 255)
    @NotEmpty(message = "second name cannot be null")
    @ApiModelProperty(value = "Фамилия", example = "Иванов")
    public String secondName;

    @Size(max = 255)
    @NotEmpty(message = "position cannot be null")
    @ApiModelProperty(value = "Должность", example = "Дворник")
    public String position;

    @Override
    public String toString() {
        return "{id:" + id
                + ";first_name:" + firstName
                + ";middle_name:" + middleName
                + ";second_name:" + secondName
                + ";position:" + position
                + "}";
    }
}
