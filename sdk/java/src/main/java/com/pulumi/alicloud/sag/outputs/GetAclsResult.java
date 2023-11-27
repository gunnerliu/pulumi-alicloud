// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sag.outputs;

import com.pulumi.alicloud.sag.outputs.GetAclsAcl;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAclsResult {
    /**
     * @return A list of Sag Acls. Each element contains the following attributes:
     * 
     */
    private List<GetAclsAcl> acls;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of Sag Acl IDs.
     * 
     */
    private List<String> ids;
    private @Nullable String nameRegex;
    /**
     * @return A list of Sag Acls names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;

    private GetAclsResult() {}
    /**
     * @return A list of Sag Acls. Each element contains the following attributes:
     * 
     */
    public List<GetAclsAcl> acls() {
        return this.acls;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of Sag Acl IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of Sag Acls names.
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

    public static Builder builder(GetAclsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAclsAcl> acls;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        public Builder() {}
        public Builder(GetAclsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acls = defaults.acls;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
        }

        @CustomType.Setter
        public Builder acls(List<GetAclsAcl> acls) {
            this.acls = Objects.requireNonNull(acls);
            return this;
        }
        public Builder acls(GetAclsAcl... acls) {
            return acls(List.of(acls));
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
        public GetAclsResult build() {
            final var _resultValue = new GetAclsResult();
            _resultValue.acls = acls;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            return _resultValue;
        }
    }
}
