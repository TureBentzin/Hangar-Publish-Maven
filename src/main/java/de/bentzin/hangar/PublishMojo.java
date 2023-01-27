package de.bentzin.hangar;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.sql.SQLOutput;

/**
 * @author Ture Bentzin
 * 27.01.2023
 */
@Mojo( name = "publish", defaultPhase = LifecyclePhase.INSTALL)
public class PublishMojo  extends AbstractMojo {

    @Parameter( defaultValue = "${project.build.directory}", property = "outputDir", required = true )
    private File outputDirectory;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
    }
}
