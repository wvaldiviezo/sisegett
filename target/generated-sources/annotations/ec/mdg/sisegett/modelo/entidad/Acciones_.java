package ec.mdg.sisegett.modelo.entidad;

import ec.mdg.sisegett.modelo.entidad.Actividades;
import ec.mdg.sisegett.modelo.entidad.Importancia;
import ec.mdg.sisegett.modelo.entidad.Institucion;
import ec.mdg.sisegett.modelo.entidad.Objetivosespecificos;
import ec.mdg.sisegett.modelo.entidad.Tipoproyecto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-18T11:29:07")
@StaticMetamodel(Acciones.class)
public class Acciones_ { 

    public static volatile SingularAttribute<Acciones, String> auusuarioregistroacc;
    public static volatile SingularAttribute<Acciones, String> detalleavanceacc;
    public static volatile SingularAttribute<Acciones, String> auusuariomodificaacc;
    public static volatile ListAttribute<Acciones, Institucion> institucionList;
    public static volatile SingularAttribute<Acciones, Importancia> idimp;
    public static volatile SingularAttribute<Acciones, Objetivosespecificos> idobjesp;
    public static volatile SingularAttribute<Acciones, Date> aufechamodificaacc;
    public static volatile SingularAttribute<Acciones, Integer> idacc;
    public static volatile SingularAttribute<Acciones, Date> aufecharegistroacc;
    public static volatile SingularAttribute<Acciones, Date> fechainicioacc;
    public static volatile SingularAttribute<Acciones, String> descripcionacc;
    public static volatile ListAttribute<Acciones, Actividades> actividadesList;
    public static volatile SingularAttribute<Acciones, Integer> idtip;
    public static volatile ListAttribute<Acciones, Tipoproyecto> tipoproyectoList;
    public static volatile SingularAttribute<Acciones, Date> fechafinacc;

}