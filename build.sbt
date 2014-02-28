val originalJvmOptions = sys.process.javaVmArguments.filter(
  a => Seq("-Xmx","-Xms", "-XX").exists(a.startsWith)
)

val baseSettings = Seq(
  scalaVersion := "2.10.3",
  scalacOptions := Seq("-language:_", "-deprecation", "-unchecked", "-Xlint"),
  watchSources ~= { _.filterNot(f => f.getName.endsWith(".swp") || f.getName.endsWith(".swo") || f.isDirectory) },
  javaOptions ++= originalJvmOptions,
  resolvers ++= Seq(Opts.resolver.sonatypeReleases)
)

val main = play.Project("PlayExample", "0.1-SNAPSHOT", Seq()).settings(
  baseSettings : _*
)

