// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bastionhost.outputs;

import com.pulumi.alicloud.bastionhost.outputs.GetHostsHost;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHostsResult {
    private final @Nullable Boolean enableDetails;
    private final @Nullable String hostAddress;
    private final @Nullable String hostName;
    private final List<GetHostsHost> hosts;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final String instanceId;
    private final @Nullable String nameRegex;
    private final List<String> names;
    private final @Nullable String osType;
    private final @Nullable String outputFile;
    private final @Nullable String source;
    private final @Nullable String sourceInstanceId;
    private final @Nullable String sourceInstanceState;

    @CustomType.Constructor
    private GetHostsResult(
        @CustomType.Parameter("enableDetails") @Nullable Boolean enableDetails,
        @CustomType.Parameter("hostAddress") @Nullable String hostAddress,
        @CustomType.Parameter("hostName") @Nullable String hostName,
        @CustomType.Parameter("hosts") List<GetHostsHost> hosts,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("osType") @Nullable String osType,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("source") @Nullable String source,
        @CustomType.Parameter("sourceInstanceId") @Nullable String sourceInstanceId,
        @CustomType.Parameter("sourceInstanceState") @Nullable String sourceInstanceState) {
        this.enableDetails = enableDetails;
        this.hostAddress = hostAddress;
        this.hostName = hostName;
        this.hosts = hosts;
        this.id = id;
        this.ids = ids;
        this.instanceId = instanceId;
        this.nameRegex = nameRegex;
        this.names = names;
        this.osType = osType;
        this.outputFile = outputFile;
        this.source = source;
        this.sourceInstanceId = sourceInstanceId;
        this.sourceInstanceState = sourceInstanceState;
    }

    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }
    public Optional<String> hostAddress() {
        return Optional.ofNullable(this.hostAddress);
    }
    public Optional<String> hostName() {
        return Optional.ofNullable(this.hostName);
    }
    public List<GetHostsHost> hosts() {
        return this.hosts;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public String instanceId() {
        return this.instanceId;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> osType() {
        return Optional.ofNullable(this.osType);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    public Optional<String> sourceInstanceId() {
        return Optional.ofNullable(this.sourceInstanceId);
    }
    public Optional<String> sourceInstanceState() {
        return Optional.ofNullable(this.sourceInstanceState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHostsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableDetails;
        private @Nullable String hostAddress;
        private @Nullable String hostName;
        private List<GetHostsHost> hosts;
        private String id;
        private List<String> ids;
        private String instanceId;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String osType;
        private @Nullable String outputFile;
        private @Nullable String source;
        private @Nullable String sourceInstanceId;
        private @Nullable String sourceInstanceState;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHostsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDetails = defaults.enableDetails;
    	      this.hostAddress = defaults.hostAddress;
    	      this.hostName = defaults.hostName;
    	      this.hosts = defaults.hosts;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceId = defaults.instanceId;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.osType = defaults.osType;
    	      this.outputFile = defaults.outputFile;
    	      this.source = defaults.source;
    	      this.sourceInstanceId = defaults.sourceInstanceId;
    	      this.sourceInstanceState = defaults.sourceInstanceState;
        }

        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
            return this;
        }
        public Builder hostAddress(@Nullable String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public Builder hostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }
        public Builder hosts(List<GetHostsHost> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }
        public Builder hosts(GetHostsHost... hosts) {
            return hosts(List.of(hosts));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        public Builder sourceInstanceId(@Nullable String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public Builder sourceInstanceState(@Nullable String sourceInstanceState) {
            this.sourceInstanceState = sourceInstanceState;
            return this;
        }        public GetHostsResult build() {
            return new GetHostsResult(enableDetails, hostAddress, hostName, hosts, id, ids, instanceId, nameRegex, names, osType, outputFile, source, sourceInstanceId, sourceInstanceState);
        }
    }
}
