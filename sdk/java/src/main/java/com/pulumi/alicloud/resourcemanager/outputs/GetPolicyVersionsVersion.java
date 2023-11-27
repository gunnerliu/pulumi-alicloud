// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPolicyVersionsVersion {
    /**
     * @return The ID of the resource, the value is `&lt;policy_name&gt;`:`&lt;version_id&gt;`.
     * 
     */
    private String id;
    /**
     * @return Indicates whether the policy version is the default version.
     * 
     */
    private Boolean isDefaultVersion;
    /**
     * @return (Available in v1.114.0+) The policy document of the policy version.
     * 
     */
    private String policyDocument;
    /**
     * @return The ID of the policy version.
     * 
     */
    private String versionId;

    private GetPolicyVersionsVersion() {}
    /**
     * @return The ID of the resource, the value is `&lt;policy_name&gt;`:`&lt;version_id&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates whether the policy version is the default version.
     * 
     */
    public Boolean isDefaultVersion() {
        return this.isDefaultVersion;
    }
    /**
     * @return (Available in v1.114.0+) The policy document of the policy version.
     * 
     */
    public String policyDocument() {
        return this.policyDocument;
    }
    /**
     * @return The ID of the policy version.
     * 
     */
    public String versionId() {
        return this.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyVersionsVersion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private Boolean isDefaultVersion;
        private String policyDocument;
        private String versionId;
        public Builder() {}
        public Builder(GetPolicyVersionsVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.isDefaultVersion = defaults.isDefaultVersion;
    	      this.policyDocument = defaults.policyDocument;
    	      this.versionId = defaults.versionId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder isDefaultVersion(Boolean isDefaultVersion) {
            this.isDefaultVersion = Objects.requireNonNull(isDefaultVersion);
            return this;
        }
        @CustomType.Setter
        public Builder policyDocument(String policyDocument) {
            this.policyDocument = Objects.requireNonNull(policyDocument);
            return this;
        }
        @CustomType.Setter
        public Builder versionId(String versionId) {
            this.versionId = Objects.requireNonNull(versionId);
            return this;
        }
        public GetPolicyVersionsVersion build() {
            final var _resultValue = new GetPolicyVersionsVersion();
            _resultValue.id = id;
            _resultValue.isDefaultVersion = isDefaultVersion;
            _resultValue.policyDocument = policyDocument;
            _resultValue.versionId = versionId;
            return _resultValue;
        }
    }
}
