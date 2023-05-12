// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ots.outputs;

import com.pulumi.alicloud.ots.outputs.GetTunnelsTunnel;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTunnelsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of tunnel IDs.
     * 
     */
    private final List<String> ids;
    /**
     * @return The OTS instance name.
     * 
     */
    private final String instanceName;
    private final @Nullable String nameRegex;
    /**
     * @return A list of tunnel names.
     * 
     */
    private final List<String> names;
    private final @Nullable String outputFile;
    /**
     * @return The table name of the OTS which could not be changed.
     * 
     */
    private final String tableName;
    /**
     * @return A list of tunnels. Each element contains the following attributes:
     * 
     */
    private final List<GetTunnelsTunnel> tunnels;

    @CustomType.Constructor
    private GetTunnelsResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("instanceName") String instanceName,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("tableName") String tableName,
        @CustomType.Parameter("tunnels") List<GetTunnelsTunnel> tunnels) {
        this.id = id;
        this.ids = ids;
        this.instanceName = instanceName;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.tableName = tableName;
        this.tunnels = tunnels;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of tunnel IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return The OTS instance name.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of tunnel names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The table name of the OTS which could not be changed.
     * 
     */
    public String tableName() {
        return this.tableName;
    }
    /**
     * @return A list of tunnels. Each element contains the following attributes:
     * 
     */
    public List<GetTunnelsTunnel> tunnels() {
        return this.tunnels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTunnelsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> ids;
        private String instanceName;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private String tableName;
        private List<GetTunnelsTunnel> tunnels;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTunnelsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceName = defaults.instanceName;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.tableName = defaults.tableName;
    	      this.tunnels = defaults.tunnels;
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
        public Builder instanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
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
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder tunnels(List<GetTunnelsTunnel> tunnels) {
            this.tunnels = Objects.requireNonNull(tunnels);
            return this;
        }
        public Builder tunnels(GetTunnelsTunnel... tunnels) {
            return tunnels(List.of(tunnels));
        }        public GetTunnelsResult build() {
            return new GetTunnelsResult(id, ids, instanceName, nameRegex, names, outputFile, tableName, tunnels);
        }
    }
}
