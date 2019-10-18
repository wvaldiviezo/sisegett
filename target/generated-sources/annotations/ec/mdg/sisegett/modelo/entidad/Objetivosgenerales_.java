package ec.mdg.sisegett.modelo.entidad;

import ec.mdg.sisegett.modelo.entidad.Anios;
import ec.mdg.sisegett.modelo.entidad.Ejes;
import ec.mdg.sisegett.modelo.entidad.Objetivosespecificos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-18T11:29:07")
@StaticMetamodel(Objetivosgenerales.class)
public class Objetivosgenerales_ { 

    public static volatile SingularAttribute<Objetivosgenerales, Ejes> ideje;
    public static volatile SingularAttribute<Objetivosgenerales, Anios> idani;
    public static volatile ListAttribute<Objetivosgenerales, Objetivosespecificos> objetivosespecificosList;
    public static volatile SingularAttribute<Objetivosgenerales, Integer> idobjgen;
    public static volatile SingularAttribute<Objetivosgenerales, String> descripcionobjgen;

}