// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.alicloud.slb.outputs.GetRulesSlbRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRulesResult {
    private Integer frontendPort;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of SLB listener rules IDs.
     * 
     */
    private List<String> ids;
    private String loadBalancerId;
    private @Nullable String nameRegex;
    /**
     * @return A list of SLB listener rules names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    /**
     * @return A list of SLB listener rules. Each element contains the following attributes:
     * 
     */
    private List<GetRulesSlbRule> slbRules;

    private GetRulesResult() {}
    public Integer frontendPort() {
        return this.frontendPort;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of SLB listener rules IDs.
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
     * @return A list of SLB listener rules names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return A list of SLB listener rules. Each element contains the following attributes:
     * 
     */
    public List<GetRulesSlbRule> slbRules() {
        return this.slbRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer frontendPort;
        private String id;
        private List<String> ids;
        private String loadBalancerId;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetRulesSlbRule> slbRules;
        public Builder() {}
        public Builder(GetRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frontendPort = defaults.frontendPort;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.loadBalancerId = defaults.loadBalancerId;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.slbRules = defaults.slbRules;
        }

        @CustomType.Setter
        public Builder frontendPort(Integer frontendPort) {
            this.frontendPort = Objects.requireNonNull(frontendPort);
            return this;
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
        public Builder slbRules(List<GetRulesSlbRule> slbRules) {
            this.slbRules = Objects.requireNonNull(slbRules);
            return this;
        }
        public Builder slbRules(GetRulesSlbRule... slbRules) {
            return slbRules(List.of(slbRules));
        }
        public GetRulesResult build() {
            final var o = new GetRulesResult();
            o.frontendPort = frontendPort;
            o.id = id;
            o.ids = ids;
            o.loadBalancerId = loadBalancerId;
            o.nameRegex = nameRegex;
            o.names = names;
            o.outputFile = outputFile;
            o.slbRules = slbRules;
            return o;
        }
    }
}
