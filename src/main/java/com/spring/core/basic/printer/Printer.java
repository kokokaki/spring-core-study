package com.spring.core.basic.printer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@NoArgsConstructor
public class Printer {

    private Paper paper;

    public Printer(Paper paper) {
        this.paper = paper;
    }
    //용지 출력기능
    public void printPaper() {
        System.out.println("======== 출력 내용 ========");
        for (String data : paper.getDatas()) {
            System.out.println("# " + data);
        }
    }
}
