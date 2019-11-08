package ec.mdg.sisegett.modelo.entidad;

import ec.mdg.sisegett.modelo.entidad.Correo;
import ec.mdg.sisegett.modelo.entidad.Institucion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-08T11:45:09")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> auusuarioregistroper;
    public static volatile SingularAttribute<Persona, Boolean> estadoper;
    public static volatile SingularAttribute<Persona, String> loginper;
    public static volatile SingularAttribute<Persona, Institucion> idins;
    public static volatile ListAttribute<Persona, Correo> correoList;
    public static volatile SingularAttribute<Persona, Date> aufechamodificacionper;
    public static volatile SingularAttribute<Persona, String> apellidosper;
    public static volatile SingularAttribute<Persona, Integer> idper;
    public static volatile SingularAttribute<Persona, String> cedulaper;
    public static volatile SingularAttribute<Persona, Date> aufecharegistroper;
    public static volatile SingularAttribute<Persona, String> nombresper;
    public static volatile SingularAttribute<Persona, String> cargoper;
    public static volatile SingularAttribute<Persona, String> auusuariomodificacionper;
    public static volatile SingularAttribute<Persona, String> celularper;
    public static volatile SingularAttribute<Persona, String> telefonoper;
    public static volatile SingularAttribute<Persona, String> tipousuariomenuper;
    public static volatile SingularAttribute<Persona, String> claveper;

}