GRADLE:=./gradlew
GRADLEFLAGS:=--warning-mode all
BUILD:=$(GRADLE)
BUILDFLAGS:=$(GRADLEFLAGS)
GRADLE_BOOTSTRAP:=$(firstword $(wildcard $(GRADLE) $(shell which gradle)))

.PHONY: all
## Builds and verifies the project.
all: build

.PHONY: build
## Builds and verifies the project.
build: $(BUILD)
	$(BUILD) $(BUILDFLAGS) $@

.PHONY: clean
clean:: $(BUILD)
	$(BUILD) $(BUILDFLAGS) $@

.PHONY: run
## Runs the application.
run: bootRun
bootRun: $(BUILD)
	$(BUILD) $(BUILDFLAGS) $@

.PHONY: wrapper
## Generates the wrapper.
wrapper: $(BUILD)
$(BUILD):
	$(GRADLE_BOOTSTRAP) wrapper

-include ~/.User.mk
-include .User.mk
