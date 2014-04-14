package arquillian;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Filters;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.runner.RunWith;

@RunWith( Arquillian.class )
public abstract class ArquillianWarBase {
    private static WebArchive war;
    @Deployment
    public static WebArchive createDeployment() {
        if( war == null ) {
            war = ShrinkWrap.create( WebArchive.class, "jboss-test.war" )
                    .addPackages( true, Filters.exclude( ".*Test.*" ),
                            "learn" )
                    .addClass( ArquillianWarBase.class )
                    .addAsWebInfResource( "beans-test.xml", "beans.xml" )
                    .addAsWebInfResource( "web-test.xml", "web.xml" );
            System.out.println( war.toString( true ) );
        }
        return war;
    }

    public static void log( Object... objects ) {
        for( Object object : objects ) {
            System.out.println( object.toString() );
        }
    }

}

