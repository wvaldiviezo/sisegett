package ec.mdg.sisegett.modelo.entidad;

import ec.mdg.sisegett.modelo.entidad.Acciones;
import ec.mdg.sisegett.modelo.entidad.Archivosverificables;
import ec.mdg.sisegett.modelo.entidad.Avance;
import ec.mdg.sisegett.modelo.entidad.Duracion;
import ec.mdg.sisegett.modelo.entidad.Estadogestion;
import ec.mdg.sisegett.modelo.entidad.Peso;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-18T11:29:07")
@StaticMetamodel(Actividades.class)
public class Actividades_ { 

    public static volatile SingularAttribute<Actividades, Date> aufecharegistroact;
    public static volatile SingularAttribute<Actividades, Integer> idact;
    public static volatile SingularAttribute<Actividades, String> descripcionact;
    public static volatile ListAttribute<Actividades, Archivosverificables> archivosverificablesList;
    public static volatile SingularAttribute<Actividades, Avance> idava;
    public static volatile SingularAttribute<Actividades, String> auusuariomodificaact;
    public static volatile SingularAttribute<Actividades, Date> fechafinact;
    public static volatile SingularAttribute<Actividades, Acciones> idacc;
    public static volatile SingularAttribute<Actividades, Duracion> iddur;
    public static volatile SingularAttribute<Actividades, Date> aufechamodificacionact;
    public static volatile SingularAttribute<Actividades, String> auusuarioregistroact;
    public static volatile SingularAttribute<Actividades, Peso> idpes;
    public static volatile SingularAttribute<Actividades, Date> fechainicioact;
    public static volatile SingularAttribute<Actividades, Estadogestion> idest;

}