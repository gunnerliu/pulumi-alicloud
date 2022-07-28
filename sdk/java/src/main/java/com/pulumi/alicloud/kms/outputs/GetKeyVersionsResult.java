// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kms.outputs;

import com.pulumi.alicloud.kms.outputs.GetKeyVersionsVersion;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKeyVersionsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of KMS KeyVersion IDs.
     * 
     */
    private final List<String> ids;
    /**
     * @return ID of the key.
     * 
     */
    private final String keyId;
    private final @Nullable String outputFile;
    /**
     * @return A list of KMS KeyVersions. Each element contains the following attributes:
     * 
     */
    private final List<GetKeyVersionsVersion> versions;

    @CustomType.Constructor
    private GetKeyVersionsResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("keyId") String keyId,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("versions") List<GetKeyVersionsVersion> versions) {
        this.id = id;
        this.ids = ids;
        this.keyId = keyId;
        this.outputFile = outputFile;
        this.versions = versions;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of KMS KeyVersion IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return ID of the key.
     * 
     */
    public String keyId() {
        return this.keyId;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return A list of KMS KeyVersions. Each element contains the following attributes:
     * 
     */
    public List<GetKeyVersionsVersion> versions() {
        return this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyVersionsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> ids;
        private String keyId;
        private @Nullable String outputFile;
        private List<GetKeyVersionsVersion> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyVersionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.keyId = defaults.keyId;
    	      this.outputFile = defaults.outputFile;
    	      this.versions = defaults.versions;
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
        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder versions(List<GetKeyVersionsVersion> versions) {
            this.versions = Objects.requireNonNull(versions);
            return this;
        }
        public Builder versions(GetKeyVersionsVersion... versions) {
            return versions(List.of(versions));
        }        public GetKeyVersionsResult build() {
            return new GetKeyVersionsResult(id, ids, keyId, outputFile, versions);
        }
    }
}
