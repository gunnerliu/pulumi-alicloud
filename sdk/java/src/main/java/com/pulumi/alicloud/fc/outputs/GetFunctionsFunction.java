// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.alicloud.fc.outputs.GetFunctionsFunctionCustomContainerConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFunctionsFunction {
    /**
     * @return The port that the function listen to, only valid for [custom runtime](https://www.alibabacloud.com/help/doc-detail/132044.htm) and [custom container runtime](https://www.alibabacloud.com/help/doc-detail/179368.htm).
     * 
     */
    private final Integer caPort;
    /**
     * @return Checksum (crc64) of the function code.
     * 
     */
    private final String codeChecksum;
    /**
     * @return Function code size in bytes.
     * 
     */
    private final Integer codeSize;
    /**
     * @return Function creation time.
     * 
     */
    private final String creationTime;
    /**
     * @return The configuration for custom container runtime. It contains following attributes:
     * 
     */
    private final @Nullable GetFunctionsFunctionCustomContainerConfig customContainerConfig;
    /**
     * @return Function description.
     * 
     */
    private final String description;
    /**
     * @return A map that defines environment variables for the function.
     * 
     */
    private final Map<String,Object> environmentVariables;
    /**
     * @return Function [entry point](https://www.alibabacloud.com/help/doc-detail/62213.htm) in the code.
     * 
     */
    private final String handler;
    /**
     * @return Function ID.
     * 
     */
    private final String id;
    /**
     * @return The maximum length of time, in seconds, that the function&#39;s initialization should be run for.
     * 
     */
    private final Integer initializationTimeout;
    /**
     * @return The entry point of the function&#39;s [initialization](https://www.alibabacloud.com/help/doc-detail/157704.htm).
     * 
     */
    private final String initializer;
    /**
     * @return The maximum number of requests can be executed concurrently within the single function instance.
     * 
     */
    private final Integer instanceConcurrency;
    /**
     * @return The instance type of the function.
     * 
     */
    private final String instanceType;
    /**
     * @return Function last modification time.
     * 
     */
    private final String lastModificationTime;
    /**
     * @return Amount of memory in MB the function can use at runtime.
     * 
     */
    private final Integer memorySize;
    /**
     * @return Function name.
     * 
     */
    private final String name;
    /**
     * @return Function runtime. The list of possible values is [available here](https://www.alibabacloud.com/help/doc-detail/52077.htm).
     * 
     */
    private final String runtime;
    /**
     * @return Maximum amount of time the function can run in seconds.
     * 
     */
    private final Integer timeout;

    @CustomType.Constructor
    private GetFunctionsFunction(
        @CustomType.Parameter("caPort") Integer caPort,
        @CustomType.Parameter("codeChecksum") String codeChecksum,
        @CustomType.Parameter("codeSize") Integer codeSize,
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("customContainerConfig") @Nullable GetFunctionsFunctionCustomContainerConfig customContainerConfig,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("environmentVariables") Map<String,Object> environmentVariables,
        @CustomType.Parameter("handler") String handler,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("initializationTimeout") Integer initializationTimeout,
        @CustomType.Parameter("initializer") String initializer,
        @CustomType.Parameter("instanceConcurrency") Integer instanceConcurrency,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("lastModificationTime") String lastModificationTime,
        @CustomType.Parameter("memorySize") Integer memorySize,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("runtime") String runtime,
        @CustomType.Parameter("timeout") Integer timeout) {
        this.caPort = caPort;
        this.codeChecksum = codeChecksum;
        this.codeSize = codeSize;
        this.creationTime = creationTime;
        this.customContainerConfig = customContainerConfig;
        this.description = description;
        this.environmentVariables = environmentVariables;
        this.handler = handler;
        this.id = id;
        this.initializationTimeout = initializationTimeout;
        this.initializer = initializer;
        this.instanceConcurrency = instanceConcurrency;
        this.instanceType = instanceType;
        this.lastModificationTime = lastModificationTime;
        this.memorySize = memorySize;
        this.name = name;
        this.runtime = runtime;
        this.timeout = timeout;
    }

    /**
     * @return The port that the function listen to, only valid for [custom runtime](https://www.alibabacloud.com/help/doc-detail/132044.htm) and [custom container runtime](https://www.alibabacloud.com/help/doc-detail/179368.htm).
     * 
     */
    public Integer caPort() {
        return this.caPort;
    }
    /**
     * @return Checksum (crc64) of the function code.
     * 
     */
    public String codeChecksum() {
        return this.codeChecksum;
    }
    /**
     * @return Function code size in bytes.
     * 
     */
    public Integer codeSize() {
        return this.codeSize;
    }
    /**
     * @return Function creation time.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return The configuration for custom container runtime. It contains following attributes:
     * 
     */
    public Optional<GetFunctionsFunctionCustomContainerConfig> customContainerConfig() {
        return Optional.ofNullable(this.customContainerConfig);
    }
    /**
     * @return Function description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A map that defines environment variables for the function.
     * 
     */
    public Map<String,Object> environmentVariables() {
        return this.environmentVariables;
    }
    /**
     * @return Function [entry point](https://www.alibabacloud.com/help/doc-detail/62213.htm) in the code.
     * 
     */
    public String handler() {
        return this.handler;
    }
    /**
     * @return Function ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The maximum length of time, in seconds, that the function&#39;s initialization should be run for.
     * 
     */
    public Integer initializationTimeout() {
        return this.initializationTimeout;
    }
    /**
     * @return The entry point of the function&#39;s [initialization](https://www.alibabacloud.com/help/doc-detail/157704.htm).
     * 
     */
    public String initializer() {
        return this.initializer;
    }
    /**
     * @return The maximum number of requests can be executed concurrently within the single function instance.
     * 
     */
    public Integer instanceConcurrency() {
        return this.instanceConcurrency;
    }
    /**
     * @return The instance type of the function.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return Function last modification time.
     * 
     */
    public String lastModificationTime() {
        return this.lastModificationTime;
    }
    /**
     * @return Amount of memory in MB the function can use at runtime.
     * 
     */
    public Integer memorySize() {
        return this.memorySize;
    }
    /**
     * @return Function name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Function runtime. The list of possible values is [available here](https://www.alibabacloud.com/help/doc-detail/52077.htm).
     * 
     */
    public String runtime() {
        return this.runtime;
    }
    /**
     * @return Maximum amount of time the function can run in seconds.
     * 
     */
    public Integer timeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionsFunction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer caPort;
        private String codeChecksum;
        private Integer codeSize;
        private String creationTime;
        private @Nullable GetFunctionsFunctionCustomContainerConfig customContainerConfig;
        private String description;
        private Map<String,Object> environmentVariables;
        private String handler;
        private String id;
        private Integer initializationTimeout;
        private String initializer;
        private Integer instanceConcurrency;
        private String instanceType;
        private String lastModificationTime;
        private Integer memorySize;
        private String name;
        private String runtime;
        private Integer timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionsFunction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caPort = defaults.caPort;
    	      this.codeChecksum = defaults.codeChecksum;
    	      this.codeSize = defaults.codeSize;
    	      this.creationTime = defaults.creationTime;
    	      this.customContainerConfig = defaults.customContainerConfig;
    	      this.description = defaults.description;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.handler = defaults.handler;
    	      this.id = defaults.id;
    	      this.initializationTimeout = defaults.initializationTimeout;
    	      this.initializer = defaults.initializer;
    	      this.instanceConcurrency = defaults.instanceConcurrency;
    	      this.instanceType = defaults.instanceType;
    	      this.lastModificationTime = defaults.lastModificationTime;
    	      this.memorySize = defaults.memorySize;
    	      this.name = defaults.name;
    	      this.runtime = defaults.runtime;
    	      this.timeout = defaults.timeout;
        }

        public Builder caPort(Integer caPort) {
            this.caPort = Objects.requireNonNull(caPort);
            return this;
        }
        public Builder codeChecksum(String codeChecksum) {
            this.codeChecksum = Objects.requireNonNull(codeChecksum);
            return this;
        }
        public Builder codeSize(Integer codeSize) {
            this.codeSize = Objects.requireNonNull(codeSize);
            return this;
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder customContainerConfig(@Nullable GetFunctionsFunctionCustomContainerConfig customContainerConfig) {
            this.customContainerConfig = customContainerConfig;
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder environmentVariables(Map<String,Object> environmentVariables) {
            this.environmentVariables = Objects.requireNonNull(environmentVariables);
            return this;
        }
        public Builder handler(String handler) {
            this.handler = Objects.requireNonNull(handler);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder initializationTimeout(Integer initializationTimeout) {
            this.initializationTimeout = Objects.requireNonNull(initializationTimeout);
            return this;
        }
        public Builder initializer(String initializer) {
            this.initializer = Objects.requireNonNull(initializer);
            return this;
        }
        public Builder instanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = Objects.requireNonNull(instanceConcurrency);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder lastModificationTime(String lastModificationTime) {
            this.lastModificationTime = Objects.requireNonNull(lastModificationTime);
            return this;
        }
        public Builder memorySize(Integer memorySize) {
            this.memorySize = Objects.requireNonNull(memorySize);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder runtime(String runtime) {
            this.runtime = Objects.requireNonNull(runtime);
            return this;
        }
        public Builder timeout(Integer timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }        public GetFunctionsFunction build() {
            return new GetFunctionsFunction(caPort, codeChecksum, codeSize, creationTime, customContainerConfig, description, environmentVariables, handler, id, initializationTimeout, initializer, instanceConcurrency, instanceType, lastModificationTime, memorySize, name, runtime, timeout);
        }
    }
}
