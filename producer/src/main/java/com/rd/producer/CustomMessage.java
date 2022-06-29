package com.rd.producer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * Created at 6/28/22.
 *
 * @author Ridvan Dogan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomMessage {
    private String messageId;
    private String message;
    private Date messageDate;
}
