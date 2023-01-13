// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.alicloud.slb.outputs.GetServerGroupsSlbServerGroup;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServerGroupsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of SLB VServer groups IDs.
     * 
     */
    private List<String> ids;
    private String loadBalancerId;
    private @Nullable String nameRegex;
    /**
     * @return A list of SLB VServer groups names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    /**
     * @return A list of SLB VServer groups. Each element contains the following attributes:
     * 
     */
    private List<GetServerGroupsSlbServerGroup> slbServerGroups;

    private GetServerGroupsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of SLB VServer groups IDs.
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
     * @return A list of SLB VServer groups names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return A list of SLB VServer groups. Each element contains the following attributes:
     * 
     */
    public List<GetServerGroupsSlbServerGroup> slbServerGroups() {
        return this.slbServerGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerGroupsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private String loadBalancerId;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetServerGroupsSlbServerGroup> slbServerGroups;
        public Builder() {}
        public Builder(GetServerGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.loadBalancerId = defaults.loadBalancerId;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.slbServerGroups = defaults.slbServerGroups;
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
        @CustomType.Setter
        public Builder slbServerGroups(List<GetServerGroupsSlbServerGroup> slbServerGroups) {
            this.slbServerGroups = Objects.requireNonNull(slbServerGroups);
            return this;
        }
        public Builder slbServerGroups(GetServerGroupsSlbServerGroup... slbServerGroups) {
            return slbServerGroups(List.of(slbServerGroups));
        }
        public GetServerGroupsResult build() {
            final var o = new GetServerGroupsResult();
            o.id = id;
            o.ids = ids;
            o.loadBalancerId = loadBalancerId;
            o.nameRegex = nameRegex;
            o.names = names;
            o.outputFile = outputFile;
            o.slbServerGroups = slbServerGroups;
            return o;
        }
    }
}
