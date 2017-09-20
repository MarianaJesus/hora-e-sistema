
package horadosistema;

import java.util.Date;

/**
 *
 * @author Mariana
 */
public class HoraDoSistema {

    public static void main(String[] args) {
        Date dataEhora = new Date();//criar o novo objeto data e hora
        System.out.println("A data e hora do sistema é:");
        System.out.println(dataEhora.toString());
    }
}
