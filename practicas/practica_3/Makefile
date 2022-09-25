JAVA_FILES_TO_FORMAT ?= $(shell find src -name '*.java' -print | grep -v '\.\#' | sort)

update-run-google-java-format:
	@[ -d .run-google-java-format ] && (cd .run-google-java-format && git pull -q) || git clone -q https://github.com/plume-lib/run-google-java-format.git .run-google-java-format

# Requires Java 8
reformat:
	${MAKE} update-run-google-java-format
	@./.run-google-java-format/run-google-java-format.py ${JAVA_FILES_TO_FORMAT}

# Requires Java 8
check-format:
	${MAKE} update-run-google-java-format
	@./.run-google-java-format/check-google-java-format.py ${JAVA_FILES_TO_FORMAT} || (echo "Try running:  make reformat" && /bin/false)