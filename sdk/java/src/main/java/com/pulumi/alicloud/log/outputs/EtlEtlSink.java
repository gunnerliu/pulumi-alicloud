// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EtlEtlSink {
    /**
     * @return Delivery target logstore access key id.
     * 
     */
    private final @Nullable String accessKeyId;
    /**
     * @return Delivery target logstore access key secret.
     * 
     */
    private final @Nullable String accessKeySecret;
    /**
     * @return Delivery target logstore region.
     * 
     */
    private final String endpoint;
    /**
     * @return An KMS encrypts access key id used to a log etl job. If the `access_key_id` is filled in, this field will be ignored.
     * 
     */
    private final @Nullable String kmsEncryptedAccessKeyId;
    /**
     * @return An KMS encrypts access key secret used to a log etl job. If the `access_key_secret` is filled in, this field will be ignored.
     * 
     */
    private final @Nullable String kmsEncryptedAccessKeySecret;
    /**
     * @return Delivery target logstore.
     * 
     */
    private final String logstore;
    /**
     * @return Delivery target name.
     * 
     */
    private final String name;
    /**
     * @return The project where the target logstore is delivered.
     * 
     */
    private final String project;
    /**
     * @return Sts role info under delivery target logstore. `role_arn` and `(access_key_id, access_key_secret)` fill in at most one. If you do not fill in both, then you must fill in `(kms_encrypted_access_key_id, kms_encrypted_access_key_secret, kms_encryption_access_key_id_context, kms_encryption_access_key_secret_context)` to use KMS to get the key pair.
     * 
     */
    private final @Nullable String roleArn;
    /**
     * @return ETL sinks type, the default value is AliyunLOG.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private EtlEtlSink(
        @CustomType.Parameter("accessKeyId") @Nullable String accessKeyId,
        @CustomType.Parameter("accessKeySecret") @Nullable String accessKeySecret,
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("kmsEncryptedAccessKeyId") @Nullable String kmsEncryptedAccessKeyId,
        @CustomType.Parameter("kmsEncryptedAccessKeySecret") @Nullable String kmsEncryptedAccessKeySecret,
        @CustomType.Parameter("logstore") String logstore,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("roleArn") @Nullable String roleArn,
        @CustomType.Parameter("type") @Nullable String type) {
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
        this.endpoint = endpoint;
        this.kmsEncryptedAccessKeyId = kmsEncryptedAccessKeyId;
        this.kmsEncryptedAccessKeySecret = kmsEncryptedAccessKeySecret;
        this.logstore = logstore;
        this.name = name;
        this.project = project;
        this.roleArn = roleArn;
        this.type = type;
    }

    /**
     * @return Delivery target logstore access key id.
     * 
     */
    public Optional<String> accessKeyId() {
        return Optional.ofNullable(this.accessKeyId);
    }
    /**
     * @return Delivery target logstore access key secret.
     * 
     */
    public Optional<String> accessKeySecret() {
        return Optional.ofNullable(this.accessKeySecret);
    }
    /**
     * @return Delivery target logstore region.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return An KMS encrypts access key id used to a log etl job. If the `access_key_id` is filled in, this field will be ignored.
     * 
     */
    public Optional<String> kmsEncryptedAccessKeyId() {
        return Optional.ofNullable(this.kmsEncryptedAccessKeyId);
    }
    /**
     * @return An KMS encrypts access key secret used to a log etl job. If the `access_key_secret` is filled in, this field will be ignored.
     * 
     */
    public Optional<String> kmsEncryptedAccessKeySecret() {
        return Optional.ofNullable(this.kmsEncryptedAccessKeySecret);
    }
    /**
     * @return Delivery target logstore.
     * 
     */
    public String logstore() {
        return this.logstore;
    }
    /**
     * @return Delivery target name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The project where the target logstore is delivered.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return Sts role info under delivery target logstore. `role_arn` and `(access_key_id, access_key_secret)` fill in at most one. If you do not fill in both, then you must fill in `(kms_encrypted_access_key_id, kms_encrypted_access_key_secret, kms_encryption_access_key_id_context, kms_encryption_access_key_secret_context)` to use KMS to get the key pair.
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * @return ETL sinks type, the default value is AliyunLOG.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EtlEtlSink defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessKeyId;
        private @Nullable String accessKeySecret;
        private String endpoint;
        private @Nullable String kmsEncryptedAccessKeyId;
        private @Nullable String kmsEncryptedAccessKeySecret;
        private String logstore;
        private String name;
        private String project;
        private @Nullable String roleArn;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EtlEtlSink defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.accessKeySecret = defaults.accessKeySecret;
    	      this.endpoint = defaults.endpoint;
    	      this.kmsEncryptedAccessKeyId = defaults.kmsEncryptedAccessKeyId;
    	      this.kmsEncryptedAccessKeySecret = defaults.kmsEncryptedAccessKeySecret;
    	      this.logstore = defaults.logstore;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.roleArn = defaults.roleArn;
    	      this.type = defaults.type;
        }

        public Builder accessKeyId(@Nullable String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public Builder accessKeySecret(@Nullable String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder kmsEncryptedAccessKeyId(@Nullable String kmsEncryptedAccessKeyId) {
            this.kmsEncryptedAccessKeyId = kmsEncryptedAccessKeyId;
            return this;
        }
        public Builder kmsEncryptedAccessKeySecret(@Nullable String kmsEncryptedAccessKeySecret) {
            this.kmsEncryptedAccessKeySecret = kmsEncryptedAccessKeySecret;
            return this;
        }
        public Builder logstore(String logstore) {
            this.logstore = Objects.requireNonNull(logstore);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public EtlEtlSink build() {
            return new EtlEtlSink(accessKeyId, accessKeySecret, endpoint, kmsEncryptedAccessKeyId, kmsEncryptedAccessKeySecret, logstore, name, project, roleArn, type);
        }
    }
}
