package com.barclays.ibm.springreactivemongo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDTO {

    private Integer id;
    @NotBlank
    @Size(min = 3, max = 255)
    private String customerName;

    @Size(max = 255)
    private String email;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}