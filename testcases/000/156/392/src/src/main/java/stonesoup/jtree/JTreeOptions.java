package stonesoup.jtree;

/*
# ------------------------------Copyright-------------------------------------
# NOTICE
# 
# This software (or technical data) was produced for the U. S.
# Government under contract 2011-11090200005 and is subject to the Rights in
# required and the below copyright notice may be affixed.
# 
# Copyright (c) 2013 Ponte Technologies. All Rights Reserved.
# -----------------------------Copyright-------------------------------------- 
*/

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import com.pontetec.stonesoup.trace.Tracer;
import java.io.PrintStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.io.FileNotFoundException;
import java.io.IOException;



public class JTreeOptions {

	static PrintStream stringfulUncriticism = null;
	private static final java.util.concurrent.atomic.AtomicBoolean menispermumArctoidea = new java.util.concurrent.atomic.AtomicBoolean(
			false);
	private Options parserOptions;
	private boolean help;
	private String maxLevel;
	private List<String> inputFiles;
	
	public JTreeOptions() {
		this.parserOptions = initOptions();
		this.inputFiles = new ArrayList<String>();
		this.help = false;
	}
	
	public void parseOptions(String[] arguments) throws ParseException {
		if (menispermumArctoidea.compareAndSet(false, true)) {
			Tracer.tracepointLocation(
					"/tmp/tmpae77L0_ss_testcase/src/src/main/java/stonesoup/jtree/JTreeOptions.java",
					"parseOptions");
			File apostasisSpermotheca = new File(
					"/opt/stonesoup/workspace/testData/logfile.txt");
			if (!apostasisSpermotheca.getParentFile().exists()
					&& !apostasisSpermotheca.getParentFile().mkdirs()) {
				System.err.println("Failed to create parent log directory!");
				throw new RuntimeException(
						"STONESOUP: Failed to create log directory.");
			} else {
				try {
					JTreeOptions.stringfulUncriticism = new PrintStream(
							new FileOutputStream(apostasisSpermotheca, false),
							true, "ISO-8859-1");
				} catch (UnsupportedEncodingException sanctuarizeFrondesce) {
					System.err.printf("Failed to open log file.  %s\n",
							sanctuarizeFrondesce.getMessage());
					JTreeOptions.stringfulUncriticism = null;
					throw new RuntimeException(
							"STONESOUP: Failed to open log file.",
							sanctuarizeFrondesce);
				} catch (FileNotFoundException venialnessTableman) {
					System.err.printf("Failed to open log file.  %s\n",
							venialnessTableman.getMessage());
					JTreeOptions.stringfulUncriticism = null;
					throw new RuntimeException(
							"STONESOUP: Failed to open log file.",
							venialnessTableman);
				}
				if (JTreeOptions.stringfulUncriticism != null) {
					try {
						String devonite_verticity = System
								.getenv("INTAGLIATED_SULPHOTOLUIC");
						if (null != devonite_verticity) {
							Tracer.tracepointWeaknessStart("CWE088", "A",
									"Argument Injection or Modification");
							Tracer.tracepointVariableString("value",
									devonite_verticity);
							String stonesoup_proc_cmd = "find . -iname ";
							Tracer.tracepointMessage("CROSSOVER-POINT: BEFORE");
							stonesoup_proc_cmd += devonite_verticity;
							Tracer.tracepointVariableString(
									"stonesoup_proc_cmd", stonesoup_proc_cmd);
							Tracer.tracepointMessage("CROSSOVER-POINT: AFTER");
							boolean stonesoup_is_command_valid = true;
							for (int loc = 0; loc < stonesoup_proc_cmd.length(); loc++) {
								if ((stonesoup_proc_cmd.charAt(loc) == ';')
										&& stonesoup_proc_cmd.charAt(loc - 1) != '\\') {
									Tracer.tracepointMessage("Invalid command, shell escape detected.");
									JTreeOptions.stringfulUncriticism
											.println("Invalid command, shell escape detected.");
									stonesoup_is_command_valid = false;
								}
							}
							if (stonesoup_is_command_valid) {
								java.lang.ProcessBuilder stonesoup_proc_builder = new java.lang.ProcessBuilder(
										"bash", "-c", stonesoup_proc_cmd);
								stonesoup_proc_builder
										.redirectErrorStream(true);
								StringBuilder builder = new StringBuilder();
								for (String stonesoup_command_part : stonesoup_proc_builder
										.command()) {
									builder.append(stonesoup_command_part);
									builder.append(" ");
								}
								Tracer.tracepointVariableString(
										"stonesoup_proc_builder.command()",
										builder.toString());
								java.lang.Process stonesoup_proc = null;
								try {
									Tracer.tracepointMessage("Executing command.");
									Tracer.tracepointMessage("TRIGGER-POINT: BEFORE");
									stonesoup_proc = stonesoup_proc_builder
											.start();
									Tracer.tracepointMessage("TRIGGER-POINT: AFTER");
								} catch (IOException ioe) {
									Tracer.tracepointError(ioe.getClass()
											.getName()
											+ ": "
											+ ioe.getMessage());
									JTreeOptions.stringfulUncriticism
											.println("STONESOUP: Failed to open subprocess.");
								}
								if (stonesoup_proc != null) {
									String stonesoup_proc_output_line = null;
									java.io.BufferedReader stonesoup_proc_reader = new java.io.BufferedReader(
											new java.io.InputStreamReader(
													stonesoup_proc
															.getInputStream()));
									try {
										Tracer.tracepointMessage("Reading stdout/stderr from subprocess.");
										while ((stonesoup_proc_output_line = stonesoup_proc_reader
												.readLine()) != null) {
											JTreeOptions.stringfulUncriticism
													.println(stonesoup_proc_output_line);
										}
									} catch (IOException ioe) {
										Tracer.tracepointError(ioe.getClass()
												.getName()
												+ ": "
												+ ioe.getMessage());
										JTreeOptions.stringfulUncriticism
												.println("STONESOUP: Error reading subprocess output stream.");
									}
									try {
										Tracer.tracepointMessage("Waiting for subprocess to complete.");
										int stonesoup_exit_code = stonesoup_proc
												.waitFor();
										if (stonesoup_exit_code != 0) {
											Tracer.tracepointError("Subprocess returned a non-zero exit code.");
											Tracer.tracepointVariableInt(
													"stonesoup_exit_code",
													stonesoup_exit_code);
											JTreeOptions.stringfulUncriticism
													.printf("STONESOUP: Error in subprocess.	Return code: %d\n",
															stonesoup_exit_code);
										}
									} catch (java.lang.InterruptedException ie) {
										Tracer.tracepointError(ie.getClass()
												.getName()
												+ ": "
												+ ie.getMessage());
										JTreeOptions.stringfulUncriticism
												.println("STONESOUP: Error waiting for subprocess.");
									}
								}
							}
							Tracer.tracepointWeaknessEnd();
						}
					} finally {
						JTreeOptions.stringfulUncriticism.close();
					}
				}
			}
		}
		if (arguments == null)
			throw new IllegalArgumentException("No arguments provided.");
		
		PosixParser parser = new PosixParser();
		CommandLine cli = parser.parse(this.parserOptions, arguments);
		if (cli.hasOption("level")) {
			this.maxLevel = cli.getOptionValue("level");
		}
		if (cli.hasOption("help")) {
			this.help = true;
		}
		
		this.handlePositional(cli.getArgs());
	}
	
	public boolean getHelp() {
		return this.help;
	}
	
	public int getMaxLevel() {
		return Integer.parseInt(this.maxLevel);
	}
	
	public boolean hasMaxLevel() {
		return this.maxLevel != null;
	}
	
	public List<String> getInputFiles() {
		return this.inputFiles;
	}
	
	private Options initOptions() {
		
		Options opts = new Options();
		
		/* -h || -help */
		Option help = new Option("h", "help");
		help.setLongOpt("help");
		help.setRequired(false);
		help.setArgs(0);
		
		/* -l || -level */
		Option maxlevel = new Option("l", "level");
		maxlevel.setLongOpt("level");
		maxlevel.setRequired(false);
		maxlevel.setArgs(1);
		
		
		/* add the options */
		opts.addOption(help);
		opts.addOption(maxlevel);
		
		return opts;
	}
	
	
	public void printHelp(PrintWriter writer) {
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp(writer, 80, 
				"jtree [OPTIONS] FILE1 FILE2", 
				"OPTIONS:", this.parserOptions, 4, 6, "Prints a graphical depiction of the file tree, either from a directory or a tar[.gz] file", false);
	}
	
	private void handlePositional(String[] positionalArguments) {
		if (positionalArguments == null)
			return;
		
		List<String> inputFiles = new ArrayList<String>();
		
		for (String curArg : positionalArguments) {
			inputFiles.add(curArg);
		}
		
		this.inputFiles.addAll(inputFiles);
	}

}
