package ec.mdg.sisegett.modelo.entidad;

import ec.mdg.sisegett.modelo.entidad.Menu;
import ec.mdg.sisegett.modelo.entidad.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-18T11:29:07")
@StaticMetamodel(Perfil.class)
public class Perfil_ { 

    public static volatile ListAttribute<Perfil, Menu> menuList;
    public static volatile SingularAttribute<Perfil, Integer> idperf;
    public static volatile ListAttribute<Perfil, Persona> personaList;
    public static volatile SingularAttribute<Perfil, String> nomenclaturaperf;
    public static volatile SingularAttribute<Perfil, String> descripcionperf;

}