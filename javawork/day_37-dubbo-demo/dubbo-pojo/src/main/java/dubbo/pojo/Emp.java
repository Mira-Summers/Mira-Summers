package dubbo.pojo;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp implements Serializable {
    private Integer eid;
    private String empName;
    private String birthday;

}
