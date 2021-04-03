package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.ClienteDao;
import datos.Cliente;

public class ClienteABM {
    ClienteDao dao = new ClienteDao();

    public Cliente traer(long idCliente){
        Cliente c = dao.traer(idCliente);
        return c;
        }

    public Cliente traer(int dni){
        Cliente c = dao.traer(dni);
        return c;
        }
    public int agregar(String apeliido, String nombre, int dni, LocalDate fechaDeNacimiento){
        //consultar si existe un cleinte con el mismo deni, si excioste arrojar exception
        Cliente c = new Cliente(apeliido, nombre, dni, fechaDeNacimiento);
        return dao.agregar(c);
    }
    public void modificar(Cliente c){
        //implementar que no exista un cliente con el mismo documento
        dao.actualizar(c);
    }
    public void eliminar(long idCliente){
        //implementar que si es nulo que arroje la excepcion
        Cliente c = dao.traer(idCliente);

        dao.eliminar(c);
    }
    public List<Cliente> traer(){
        return dao.traer();
        

    }

}
