// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.outputs;

import com.pulumi.alicloud.dcdn.outputs.GetWafDomainsDomain;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWafDomainsResult {
    private List<GetWafDomainsDomain> domains;
    private @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String outputFile;
    private @Nullable String queryArgs;

    private GetWafDomainsResult() {}
    public List<GetWafDomainsDomain> domains() {
        return this.domains;
    }
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
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
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> queryArgs() {
        return Optional.ofNullable(this.queryArgs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWafDomainsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetWafDomainsDomain> domains;
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private @Nullable String queryArgs;
        public Builder() {}
        public Builder(GetWafDomainsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.queryArgs = defaults.queryArgs;
        }

        @CustomType.Setter
        public Builder domains(List<GetWafDomainsDomain> domains) {
            this.domains = Objects.requireNonNull(domains);
            return this;
        }
        public Builder domains(GetWafDomainsDomain... domains) {
            return domains(List.of(domains));
        }
        @CustomType.Setter
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
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
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder queryArgs(@Nullable String queryArgs) {
            this.queryArgs = queryArgs;
            return this;
        }
        public GetWafDomainsResult build() {
            final var o = new GetWafDomainsResult();
            o.domains = domains;
            o.enableDetails = enableDetails;
            o.id = id;
            o.ids = ids;
            o.outputFile = outputFile;
            o.queryArgs = queryArgs;
            return o;
        }
    }
}
