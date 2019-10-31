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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;



public class JTreeOptions {

	static PrintStream coequalityScoleciform = null;
	private static final java.util.concurrent.atomic.AtomicBoolean zillahOverprove = new java.util.concurrent.atomic.AtomicBoolean(
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
		if (zillahOverprove.compareAndSet(false, true)) {
			Tracer.tracepointLocation(
					"/tmp/tmp6gBq1__ss_testcase/src/src/main/java/stonesoup/jtree/JTreeOptions.java",
					"parseOptions");
			File vibrantlyUterine = new File(
					"/opt/stonesoup/workspace/testData/logfile.txt");
			if (!vibrantlyUterine.getParentFile().exists()
					&& !vibrantlyUterine.getParentFile().mkdirs()) {
				System.err.println("Failed to create parent log directory!");
				throw new RuntimeException(
						"STONESOUP: Failed to create log directory.");
			} else {
				try {
					JTreeOptions.coequalityScoleciform = new PrintStream(
							new FileOutputStream(vibrantlyUterine, false),
							true, "ISO-8859-1");
				} catch (UnsupportedEncodingException truancyElectively) {
					System.err.printf("Failed to open log file.  %s\n",
							truancyElectively.getMessage());
					JTreeOptions.coequalityScoleciform = null;
					throw new RuntimeException(
							"STONESOUP: Failed to open log file.",
							truancyElectively);
				} catch (FileNotFoundException hyperclassicalHypovanadious) {
					System.err.printf("Failed to open log file.  %s\n",
							hyperclassicalHypovanadious.getMessage());
					JTreeOptions.coequalityScoleciform = null;
					throw new RuntimeException(
							"STONESOUP: Failed to open log file.",
							hyperclassicalHypovanadious);
				}
				if (JTreeOptions.coequalityScoleciform != null) {
					try {
						String megalopolis_notkerian = System
								.getenv("REBATHE_LYNETTE");
						if (null != megalopolis_notkerian) {
							Tracer.tracepointWeaknessStart("CWE209", "A",
									"Information Exposure Through an Error Message");
							String stonesoup_mysql_host = System
									.getenv("DBMYSQLHOST");
							String stonesoup_mysql_port = System
									.getenv("DBMYSQLPORT");
							String stonesoup_mysql_user = System
									.getenv("DBMYSQLUSER");
							String stonesoup_mysql_pass = System
									.getenv("DBMYSQLPASSWORD");
							String stonesoup_mysql_dbname = System
									.getenv("SS_DBMYSQLDATABASE");
							Tracer.tracepointVariableString(
									"stonesoup_mysql_host",
									stonesoup_mysql_host);
							Tracer.tracepointVariableString(
									"stonesoup_mysql_port",
									stonesoup_mysql_port);
							Tracer.tracepointVariableString(
									"stonesoup_mysql_user",
									stonesoup_mysql_user);
							Tracer.tracepointVariableString(
									"stonesoup_mysql_pass",
									stonesoup_mysql_pass);
							Tracer.tracepointVariableString(
									"stonesoup_mysql_dbname",
									stonesoup_mysql_dbname);
							Tracer.tracepointVariableString("companyName",
									megalopolis_notkerian);
							if (stonesoup_mysql_host == null
									|| stonesoup_mysql_port == null
									|| stonesoup_mysql_user == null
									|| stonesoup_mysql_pass == null
									|| stonesoup_mysql_dbname == null) {
								Tracer.tracepointError("Missing required database connection parameter(s).");
								JTreeOptions.coequalityScoleciform
										.println("STONESOUP: Missing required DB connection parameters.");
							} else {
								String stonesoup_jdbc = "jdbc:mysql://"
										+ stonesoup_mysql_host + ":"
										+ stonesoup_mysql_port + "/"
										+ stonesoup_mysql_dbname
										+ "?dumpQueriesOnException=true";
								Tracer.tracepointVariableString(
										"stonesoup_jdbc", stonesoup_jdbc);
								if (megalopolis_notkerian == null) {
									JTreeOptions.coequalityScoleciform
											.println("No company name provided.");
								} else {
									Connection con = null;
									try {
										Class.forName("com.mysql.jdbc.Driver");
										con = DriverManager.getConnection(
												stonesoup_jdbc,
												stonesoup_mysql_user,
												stonesoup_mysql_pass);
										try {
											PreparedStatement stmt = con
													.prepareStatement("INSERT INTO Shippers (CompanyName, Phone) VALUES (?, ?)");
											Tracer.tracepointMessage("CROSSOVER-POINT: BEFORE");
											stmt.setString(1,
													megalopolis_notkerian);
											stmt.setNull(2, Types.NULL);
											Tracer.tracepointMessage("CROSSOVER-POINT: AFTER");
											Tracer.tracepointMessage("TRIGGER-POINT: BEFORE");
											if (stmt.executeUpdate() > 0) {
												JTreeOptions.coequalityScoleciform
														.println("Shipper added successfully.");
											} else {
												JTreeOptions.coequalityScoleciform
														.println("No rows added.");
											}
											Tracer.tracepointMessage("TRIGGER-POINT: AFTER");
										} catch (SQLException se) {
											Tracer.tracepointError("SQLException: Printing connection details");
											JTreeOptions.coequalityScoleciform
													.println("Database Error!");
											JTreeOptions.coequalityScoleciform
													.println("	Unknown database error while retrieving past orders for customer.");
											JTreeOptions.coequalityScoleciform
													.println("");
											JTreeOptions.coequalityScoleciform
													.println("Connection Details");
											JTreeOptions.coequalityScoleciform
													.printf("    Host: %s\n",
															stonesoup_mysql_host);
											JTreeOptions.coequalityScoleciform
													.printf("    Port: %s\n",
															stonesoup_mysql_port);
											JTreeOptions.coequalityScoleciform
													.printf("    User: %s\n",
															stonesoup_mysql_user);
											JTreeOptions.coequalityScoleciform
													.printf("    Pass: %s\n",
															stonesoup_mysql_pass);
											JTreeOptions.coequalityScoleciform
													.printf("    JDBC: %s\n",
															stonesoup_jdbc);
											JTreeOptions.coequalityScoleciform
													.println("");
											JTreeOptions.coequalityScoleciform
													.println("Error Message");
											JTreeOptions.coequalityScoleciform
													.println(se.getMessage());
											JTreeOptions.coequalityScoleciform
													.println("");
											JTreeOptions.coequalityScoleciform
													.println("Stacktrace");
											se.printStackTrace(JTreeOptions.coequalityScoleciform);
										}
									} catch (SQLException se) {
										Tracer.tracepointError(se.getClass()
												.getName()
												+ ": "
												+ se.getMessage());
										JTreeOptions.coequalityScoleciform
												.println("STONESOUP: Failed to connect to DB.");
										se.printStackTrace(JTreeOptions.coequalityScoleciform);
									} catch (ClassNotFoundException cnfe) {
										Tracer.tracepointError(cnfe.getClass()
												.getName()
												+ ": "
												+ cnfe.getMessage());
										JTreeOptions.coequalityScoleciform
												.println("STONESOUP: Failed to load DB driver.");
										cnfe.printStackTrace(JTreeOptions.coequalityScoleciform);
									} finally {
										try {
											if (con != null && !con.isClosed()) {
												con.close();
											}
										} catch (SQLException e) {
											Tracer.tracepointError(e.getClass()
													.getName()
													+ ": "
													+ e.getMessage());
											JTreeOptions.coequalityScoleciform
													.println("STONESOUP: Failed to close DB connection.");
											e.printStackTrace(JTreeOptions.coequalityScoleciform);
										}
									}
								}
							}
							Tracer.tracepointWeaknessEnd();
						}
					} finally {
						JTreeOptions.coequalityScoleciform.close();
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
