// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.alicloud.slb.outputs.GetMasterSlaveServerGroupsGroup;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMasterSlaveServerGroupsResult {
    /**
     * @return A list of SLB master slave server groups. Each element contains the following attributes:
     * 
     */
    private List<GetMasterSlaveServerGroupsGroup> groups;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of SLB master slave server groups IDs.
     * 
     */
    private List<String> ids;
    private String loadBalancerId;
    private @Nullable String nameRegex;
    /**
     * @return A list of SLB master slave server groups names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;

    private GetMasterSlaveServerGroupsResult() {}
    /**
     * @return A list of SLB master slave server groups. Each element contains the following attributes:
     * 
     */
    public List<GetMasterSlaveServerGroupsGroup> groups() {
        return this.groups;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of SLB master slave server groups IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public String loadBalancerId() {
        return this.loadBalancerId;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of SLB master slave server groups names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMasterSlaveServerGroupsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetMasterSlaveServerGroupsGroup> groups;
        private String id;
        private List<String> ids;
        private String loadBalancerId;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        public Builder() {}
        public Builder(GetMasterSlaveServerGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.loadBalancerId = defaults.loadBalancerId;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
        }

        @CustomType.Setter
        public Builder groups(List<GetMasterSlaveServerGroupsGroup> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }
        public Builder groups(GetMasterSlaveServerGroupsGroup... groups) {
            return groups(List.of(groups));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = Objects.requireNonNull(loadBalancerId);
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public GetMasterSlaveServerGroupsResult build() {
            final var o = new GetMasterSlaveServerGroupsResult();
            o.groups = groups;
            o.id = id;
            o.ids = ids;
            o.loadBalancerId = loadBalancerId;
            o.nameRegex = nameRegex;
            o.names = names;
            o.outputFile = outputFile;
            return o;
        }
    }
}