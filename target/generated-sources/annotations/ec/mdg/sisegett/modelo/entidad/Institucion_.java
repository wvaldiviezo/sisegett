package ec.mdg.sisegett.modelo.entidad;

import ec.mdg.sisegett.modelo.entidad.Acciones;
import ec.mdg.sisegett.modelo.entidad.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-08T11:45:09")
@StaticMetamodel(Institucion.class)
public class Institucion_ { 

    public static volatile SingularAttribute<Institucion, String> descripcionins;
    public static volatile SingularAttribute<Institucion, Integer> idins;
    public static volatile ListAttribute<Institucion, Persona> personaList;
    public static volatile ListAttribute<Institucion, Acciones> accionesList;

}