mainclass := com.company.Main

.PHONY: compile crun run clean

compile:
	@ mvn compile

crun:
	@ mvn compile
	@ java -cp target/classes/ $(mainclass)

run:
	@ java -cp target/classes/ $(mainclass)

clean:
	@ mvn clean
