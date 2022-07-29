// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log.inputs;

import com.pulumi.alicloud.log.inputs.EtlEtlSinkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EtlState extends com.pulumi.resources.ResourceArgs {

    public static final EtlState Empty = new EtlState();

    /**
     * Delivery target logstore access key id.
     * 
     */
    @Import(name="accessKeyId")
    private @Nullable Output<String> accessKeyId;

    /**
     * @return Delivery target logstore access key id.
     * 
     */
    public Optional<Output<String>> accessKeyId() {
        return Optional.ofNullable(this.accessKeyId);
    }

    /**
     * Delivery target logstore access key secret.
     * 
     */
    @Import(name="accessKeySecret")
    private @Nullable Output<String> accessKeySecret;

    /**
     * @return Delivery target logstore access key secret.
     * 
     */
    public Optional<Output<String>> accessKeySecret() {
        return Optional.ofNullable(this.accessKeySecret);
    }

    /**
     * The etl job create time.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<Integer> createTime;

    /**
     * @return The etl job create time.
     * 
     */
    public Optional<Output<Integer>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Description of the log etl job.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the log etl job.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Log service etl job alias.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Log service etl job alias.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The name of the log etl job.
     * 
     */
    @Import(name="etlName")
    private @Nullable Output<String> etlName;

    /**
     * @return The name of the log etl job.
     * 
     */
    public Optional<Output<String>> etlName() {
        return Optional.ofNullable(this.etlName);
    }

    /**
     * Target logstore configuration for delivery after data processing.
     * 
     */
    @Import(name="etlSinks")
    private @Nullable Output<List<EtlEtlSinkArgs>> etlSinks;

    /**
     * @return Target logstore configuration for delivery after data processing.
     * 
     */
    public Optional<Output<List<EtlEtlSinkArgs>>> etlSinks() {
        return Optional.ofNullable(this.etlSinks);
    }

    /**
     * Log service etl type, the default value is `ETL`.
     * 
     */
    @Import(name="etlType")
    private @Nullable Output<String> etlType;

    /**
     * @return Log service etl type, the default value is `ETL`.
     * 
     */
    public Optional<Output<String>> etlType() {
        return Optional.ofNullable(this.etlType);
    }

    /**
     * The start time of the processing job, if not set the value is 0, indicates to start processing from the oldest data.
     * 
     */
    @Import(name="fromTime")
    private @Nullable Output<Integer> fromTime;

    /**
     * @return The start time of the processing job, if not set the value is 0, indicates to start processing from the oldest data.
     * 
     */
    public Optional<Output<Integer>> fromTime() {
        return Optional.ofNullable(this.fromTime);
    }

    /**
     * An KMS encrypts access key id used to a log etl job. If the `access_key_id` is filled in, this field will be ignored.
     * 
     */
    @Import(name="kmsEncryptedAccessKeyId")
    private @Nullable Output<String> kmsEncryptedAccessKeyId;

    /**
     * @return An KMS encrypts access key id used to a log etl job. If the `access_key_id` is filled in, this field will be ignored.
     * 
     */
    public Optional<Output<String>> kmsEncryptedAccessKeyId() {
        return Optional.ofNullable(this.kmsEncryptedAccessKeyId);
    }

    /**
     * An KMS encrypts access key secret used to a log etl job. If the `access_key_secret` is filled in, this field will be ignored.
     * 
     */
    @Import(name="kmsEncryptedAccessKeySecret")
    private @Nullable Output<String> kmsEncryptedAccessKeySecret;

    /**
     * @return An KMS encrypts access key secret used to a log etl job. If the `access_key_secret` is filled in, this field will be ignored.
     * 
     */
    public Optional<Output<String>> kmsEncryptedAccessKeySecret() {
        return Optional.ofNullable(this.kmsEncryptedAccessKeySecret);
    }

    /**
     * An KMS encryption context used to decrypt `kms_encrypted_access_key_id` before creating or updating an instance with `kms_encrypted_access_key_id`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set. When it is changed, the instance will reboot to make the change take effect.
     * 
     */
    @Import(name="kmsEncryptionAccessKeyIdContext")
    private @Nullable Output<Map<String,Object>> kmsEncryptionAccessKeyIdContext;

    /**
     * @return An KMS encryption context used to decrypt `kms_encrypted_access_key_id` before creating or updating an instance with `kms_encrypted_access_key_id`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set. When it is changed, the instance will reboot to make the change take effect.
     * 
     */
    public Optional<Output<Map<String,Object>>> kmsEncryptionAccessKeyIdContext() {
        return Optional.ofNullable(this.kmsEncryptionAccessKeyIdContext);
    }

    /**
     * An KMS encryption context used to decrypt `kms_encrypted_access_key_secret` before creating or updating an instance with `kms_encrypted_access_key_secret`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set. When it is changed, the instance will reboot to make the change take effect.
     * 
     */
    @Import(name="kmsEncryptionAccessKeySecretContext")
    private @Nullable Output<Map<String,Object>> kmsEncryptionAccessKeySecretContext;

    /**
     * @return An KMS encryption context used to decrypt `kms_encrypted_access_key_secret` before creating or updating an instance with `kms_encrypted_access_key_secret`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set. When it is changed, the instance will reboot to make the change take effect.
     * 
     */
    public Optional<Output<Map<String,Object>>> kmsEncryptionAccessKeySecretContext() {
        return Optional.ofNullable(this.kmsEncryptionAccessKeySecretContext);
    }

    /**
     * ETL job last modified time.
     * 
     */
    @Import(name="lastModifiedTime")
    private @Nullable Output<Integer> lastModifiedTime;

    /**
     * @return ETL job last modified time.
     * 
     */
    public Optional<Output<Integer>> lastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }

    /**
     * Delivery target logstore.
     * 
     */
    @Import(name="logstore")
    private @Nullable Output<String> logstore;

    /**
     * @return Delivery target logstore.
     * 
     */
    public Optional<Output<String>> logstore() {
        return Optional.ofNullable(this.logstore);
    }

    /**
     * Advanced parameter configuration of processing operations.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return Advanced parameter configuration of processing operations.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The project where the target logstore is delivered.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project where the target logstore is delivered.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Sts role info under delivery target logstore. `role_arn` and `(access_key_id, access_key_secret)` fill in at most one. If you do not fill in both, then you must fill in `(kms_encrypted_access_key_id, kms_encrypted_access_key_secret, kms_encryption_access_key_id_context, kms_encryption_access_key_secret_context)` to use KMS to get the key pair.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return Sts role info under delivery target logstore. `role_arn` and `(access_key_id, access_key_secret)` fill in at most one. If you do not fill in both, then you must fill in `(kms_encrypted_access_key_id, kms_encrypted_access_key_secret, kms_encryption_access_key_id_context, kms_encryption_access_key_secret_context)` to use KMS to get the key pair.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * Job scheduling type, the default value is Resident.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<String> schedule;

    /**
     * @return Job scheduling type, the default value is Resident.
     * 
     */
    public Optional<Output<String>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * Processing operation grammar.
     * 
     */
    @Import(name="script")
    private @Nullable Output<String> script;

    /**
     * @return Processing operation grammar.
     * 
     */
    public Optional<Output<String>> script() {
        return Optional.ofNullable(this.script);
    }

    /**
     * Log project tags. the default value is RUNNING, Only 4 values are supported: `STARTING`，`RUNNING`，`STOPPING`，`STOPPED`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Log project tags. the default value is RUNNING, Only 4 values are supported: `STARTING`，`RUNNING`，`STOPPING`，`STOPPED`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Deadline of processing job, if not set the value is 0, indicates that new data will be processed continuously.
     * 
     */
    @Import(name="toTime")
    private @Nullable Output<Integer> toTime;

    /**
     * @return Deadline of processing job, if not set the value is 0, indicates that new data will be processed continuously.
     * 
     */
    public Optional<Output<Integer>> toTime() {
        return Optional.ofNullable(this.toTime);
    }

    /**
     * Log etl job version. the default value is `2`.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return Log etl job version. the default value is `2`.
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private EtlState() {}

    private EtlState(EtlState $) {
        this.accessKeyId = $.accessKeyId;
        this.accessKeySecret = $.accessKeySecret;
        this.createTime = $.createTime;
        this.description = $.description;
        this.displayName = $.displayName;
        this.etlName = $.etlName;
        this.etlSinks = $.etlSinks;
        this.etlType = $.etlType;
        this.fromTime = $.fromTime;
        this.kmsEncryptedAccessKeyId = $.kmsEncryptedAccessKeyId;
        this.kmsEncryptedAccessKeySecret = $.kmsEncryptedAccessKeySecret;
        this.kmsEncryptionAccessKeyIdContext = $.kmsEncryptionAccessKeyIdContext;
        this.kmsEncryptionAccessKeySecretContext = $.kmsEncryptionAccessKeySecretContext;
        this.lastModifiedTime = $.lastModifiedTime;
        this.logstore = $.logstore;
        this.parameters = $.parameters;
        this.project = $.project;
        this.roleArn = $.roleArn;
        this.schedule = $.schedule;
        this.script = $.script;
        this.status = $.status;
        this.toTime = $.toTime;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EtlState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EtlState $;

        public Builder() {
            $ = new EtlState();
        }

        public Builder(EtlState defaults) {
            $ = new EtlState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKeyId Delivery target logstore access key id.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(@Nullable Output<String> accessKeyId) {
            $.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * @param accessKeyId Delivery target logstore access key id.
         * 
         * @return builder
         * 
         */
        public Builder accessKeyId(String accessKeyId) {
            return accessKeyId(Output.of(accessKeyId));
        }

        /**
         * @param accessKeySecret Delivery target logstore access key secret.
         * 
         * @return builder
         * 
         */
        public Builder accessKeySecret(@Nullable Output<String> accessKeySecret) {
            $.accessKeySecret = accessKeySecret;
            return this;
        }

        /**
         * @param accessKeySecret Delivery target logstore access key secret.
         * 
         * @return builder
         * 
         */
        public Builder accessKeySecret(String accessKeySecret) {
            return accessKeySecret(Output.of(accessKeySecret));
        }

        /**
         * @param createTime The etl job create time.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<Integer> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The etl job create time.
         * 
         * @return builder
         * 
         */
        public Builder createTime(Integer createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description Description of the log etl job.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the log etl job.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Log service etl job alias.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Log service etl job alias.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param etlName The name of the log etl job.
         * 
         * @return builder
         * 
         */
        public Builder etlName(@Nullable Output<String> etlName) {
            $.etlName = etlName;
            return this;
        }

        /**
         * @param etlName The name of the log etl job.
         * 
         * @return builder
         * 
         */
        public Builder etlName(String etlName) {
            return etlName(Output.of(etlName));
        }

        /**
         * @param etlSinks Target logstore configuration for delivery after data processing.
         * 
         * @return builder
         * 
         */
        public Builder etlSinks(@Nullable Output<List<EtlEtlSinkArgs>> etlSinks) {
            $.etlSinks = etlSinks;
            return this;
        }

        /**
         * @param etlSinks Target logstore configuration for delivery after data processing.
         * 
         * @return builder
         * 
         */
        public Builder etlSinks(List<EtlEtlSinkArgs> etlSinks) {
            return etlSinks(Output.of(etlSinks));
        }

        /**
         * @param etlSinks Target logstore configuration for delivery after data processing.
         * 
         * @return builder
         * 
         */
        public Builder etlSinks(EtlEtlSinkArgs... etlSinks) {
            return etlSinks(List.of(etlSinks));
        }

        /**
         * @param etlType Log service etl type, the default value is `ETL`.
         * 
         * @return builder
         * 
         */
        public Builder etlType(@Nullable Output<String> etlType) {
            $.etlType = etlType;
            return this;
        }

        /**
         * @param etlType Log service etl type, the default value is `ETL`.
         * 
         * @return builder
         * 
         */
        public Builder etlType(String etlType) {
            return etlType(Output.of(etlType));
        }

        /**
         * @param fromTime The start time of the processing job, if not set the value is 0, indicates to start processing from the oldest data.
         * 
         * @return builder
         * 
         */
        public Builder fromTime(@Nullable Output<Integer> fromTime) {
            $.fromTime = fromTime;
            return this;
        }

        /**
         * @param fromTime The start time of the processing job, if not set the value is 0, indicates to start processing from the oldest data.
         * 
         * @return builder
         * 
         */
        public Builder fromTime(Integer fromTime) {
            return fromTime(Output.of(fromTime));
        }

        /**
         * @param kmsEncryptedAccessKeyId An KMS encrypts access key id used to a log etl job. If the `access_key_id` is filled in, this field will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder kmsEncryptedAccessKeyId(@Nullable Output<String> kmsEncryptedAccessKeyId) {
            $.kmsEncryptedAccessKeyId = kmsEncryptedAccessKeyId;
            return this;
        }

        /**
         * @param kmsEncryptedAccessKeyId An KMS encrypts access key id used to a log etl job. If the `access_key_id` is filled in, this field will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder kmsEncryptedAccessKeyId(String kmsEncryptedAccessKeyId) {
            return kmsEncryptedAccessKeyId(Output.of(kmsEncryptedAccessKeyId));
        }

        /**
         * @param kmsEncryptedAccessKeySecret An KMS encrypts access key secret used to a log etl job. If the `access_key_secret` is filled in, this field will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder kmsEncryptedAccessKeySecret(@Nullable Output<String> kmsEncryptedAccessKeySecret) {
            $.kmsEncryptedAccessKeySecret = kmsEncryptedAccessKeySecret;
            return this;
        }

        /**
         * @param kmsEncryptedAccessKeySecret An KMS encrypts access key secret used to a log etl job. If the `access_key_secret` is filled in, this field will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder kmsEncryptedAccessKeySecret(String kmsEncryptedAccessKeySecret) {
            return kmsEncryptedAccessKeySecret(Output.of(kmsEncryptedAccessKeySecret));
        }

        /**
         * @param kmsEncryptionAccessKeyIdContext An KMS encryption context used to decrypt `kms_encrypted_access_key_id` before creating or updating an instance with `kms_encrypted_access_key_id`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set. When it is changed, the instance will reboot to make the change take effect.
         * 
         * @return builder
         * 
         */
        public Builder kmsEncryptionAccessKeyIdContext(@Nullable Output<Map<String,Object>> kmsEncryptionAccessKeyIdContext) {
            $.kmsEncryptionAccessKeyIdContext = kmsEncryptionAccessKeyIdContext;
            return this;
        }

        /**
         * @param kmsEncryptionAccessKeyIdContext An KMS encryption context used to decrypt `kms_encrypted_access_key_id` before creating or updating an instance with `kms_encrypted_access_key_id`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set. When it is changed, the instance will reboot to make the change take effect.
         * 
         * @return builder
         * 
         */
        public Builder kmsEncryptionAccessKeyIdContext(Map<String,Object> kmsEncryptionAccessKeyIdContext) {
            return kmsEncryptionAccessKeyIdContext(Output.of(kmsEncryptionAccessKeyIdContext));
        }

        /**
         * @param kmsEncryptionAccessKeySecretContext An KMS encryption context used to decrypt `kms_encrypted_access_key_secret` before creating or updating an instance with `kms_encrypted_access_key_secret`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set. When it is changed, the instance will reboot to make the change take effect.
         * 
         * @return builder
         * 
         */
        public Builder kmsEncryptionAccessKeySecretContext(@Nullable Output<Map<String,Object>> kmsEncryptionAccessKeySecretContext) {
            $.kmsEncryptionAccessKeySecretContext = kmsEncryptionAccessKeySecretContext;
            return this;
        }

        /**
         * @param kmsEncryptionAccessKeySecretContext An KMS encryption context used to decrypt `kms_encrypted_access_key_secret` before creating or updating an instance with `kms_encrypted_access_key_secret`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set. When it is changed, the instance will reboot to make the change take effect.
         * 
         * @return builder
         * 
         */
        public Builder kmsEncryptionAccessKeySecretContext(Map<String,Object> kmsEncryptionAccessKeySecretContext) {
            return kmsEncryptionAccessKeySecretContext(Output.of(kmsEncryptionAccessKeySecretContext));
        }

        /**
         * @param lastModifiedTime ETL job last modified time.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedTime(@Nullable Output<Integer> lastModifiedTime) {
            $.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * @param lastModifiedTime ETL job last modified time.
         * 
         * @return builder
         * 
         */
        public Builder lastModifiedTime(Integer lastModifiedTime) {
            return lastModifiedTime(Output.of(lastModifiedTime));
        }

        /**
         * @param logstore Delivery target logstore.
         * 
         * @return builder
         * 
         */
        public Builder logstore(@Nullable Output<String> logstore) {
            $.logstore = logstore;
            return this;
        }

        /**
         * @param logstore Delivery target logstore.
         * 
         * @return builder
         * 
         */
        public Builder logstore(String logstore) {
            return logstore(Output.of(logstore));
        }

        /**
         * @param parameters Advanced parameter configuration of processing operations.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Advanced parameter configuration of processing operations.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param project The project where the target logstore is delivered.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project where the target logstore is delivered.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param roleArn Sts role info under delivery target logstore. `role_arn` and `(access_key_id, access_key_secret)` fill in at most one. If you do not fill in both, then you must fill in `(kms_encrypted_access_key_id, kms_encrypted_access_key_secret, kms_encryption_access_key_id_context, kms_encryption_access_key_secret_context)` to use KMS to get the key pair.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn Sts role info under delivery target logstore. `role_arn` and `(access_key_id, access_key_secret)` fill in at most one. If you do not fill in both, then you must fill in `(kms_encrypted_access_key_id, kms_encrypted_access_key_secret, kms_encryption_access_key_id_context, kms_encryption_access_key_secret_context)` to use KMS to get the key pair.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param schedule Job scheduling type, the default value is Resident.
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule Job scheduling type, the default value is Resident.
         * 
         * @return builder
         * 
         */
        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param script Processing operation grammar.
         * 
         * @return builder
         * 
         */
        public Builder script(@Nullable Output<String> script) {
            $.script = script;
            return this;
        }

        /**
         * @param script Processing operation grammar.
         * 
         * @return builder
         * 
         */
        public Builder script(String script) {
            return script(Output.of(script));
        }

        /**
         * @param status Log project tags. the default value is RUNNING, Only 4 values are supported: `STARTING`，`RUNNING`，`STOPPING`，`STOPPED`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Log project tags. the default value is RUNNING, Only 4 values are supported: `STARTING`，`RUNNING`，`STOPPING`，`STOPPED`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param toTime Deadline of processing job, if not set the value is 0, indicates that new data will be processed continuously.
         * 
         * @return builder
         * 
         */
        public Builder toTime(@Nullable Output<Integer> toTime) {
            $.toTime = toTime;
            return this;
        }

        /**
         * @param toTime Deadline of processing job, if not set the value is 0, indicates that new data will be processed continuously.
         * 
         * @return builder
         * 
         */
        public Builder toTime(Integer toTime) {
            return toTime(Output.of(toTime));
        }

        /**
         * @param version Log etl job version. the default value is `2`.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Log etl job version. the default value is `2`.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public EtlState build() {
            return $;
        }
    }

}
