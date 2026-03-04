package serializacao;

import model.Estado;

import java.io.IOException;

public class TestaSerializadorUtil {

    public static void main(String[] args) throws IOException{

        Estado estado = new Estado();
        estado.setNome("Amazonas");
        estado.setSigla("AM");

        SerializadorUtil serializador = new SerializadorUtil();

        try {

            serializador.serializa(estado, "estado.dat");
            System.out.println("Serializado com sucesso!");

        }catch(IOException e){
            System.out.println(e.getMessage());
        }



    }

}
