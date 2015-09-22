package vizardous;

import java.io.File;
import java.util.Locale;

import javax.swing.SwingUtilities;

import org.slf4j.LoggerFactory;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.converters.FileConverter;

/**
 * This class acts as an entry point for starting a Vizardous instance. Hence,
 * it either initializes a user interface or parses the commandline arguments
 * for processing in headless mode.
 * 
 * @author Stefan Helfrich <s.helfrich@fz-juelich.de>
 */
public class Vizardous {

	public static void main(String[] args) {
		System.out.println("Test");
	}
}
