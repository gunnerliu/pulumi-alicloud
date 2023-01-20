// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretArgs Empty = new SecretArgs();

    /**
     * The description of the secret.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the secret.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The instance ID of the exclusive KMS instance.
     * 
     */
    @Import(name="dkmsInstanceId")
    private @Nullable Output<String> dkmsInstanceId;

    /**
     * @return The instance ID of the exclusive KMS instance.
     * 
     */
    public Optional<Output<String>> dkmsInstanceId() {
        return Optional.ofNullable(this.dkmsInstanceId);
    }

    /**
     * Whether to enable automatic key rotation.
     * 
     */
    @Import(name="enableAutomaticRotation")
    private @Nullable Output<Boolean> enableAutomaticRotation;

    /**
     * @return Whether to enable automatic key rotation.
     * 
     */
    public Optional<Output<Boolean>> enableAutomaticRotation() {
        return Optional.ofNullable(this.enableAutomaticRotation);
    }

    /**
     * The ID of the KMS CMK that is used to encrypt the secret value. If you do not specify this parameter, Secrets Manager automatically creates an encryption key to encrypt the secret.
     * 
     */
    @Import(name="encryptionKeyId")
    private @Nullable Output<String> encryptionKeyId;

    /**
     * @return The ID of the KMS CMK that is used to encrypt the secret value. If you do not specify this parameter, Secrets Manager automatically creates an encryption key to encrypt the secret.
     * 
     */
    public Optional<Output<String>> encryptionKeyId() {
        return Optional.ofNullable(this.encryptionKeyId);
    }

    /**
     * Specifies whether to forcibly delete the secret. If this parameter is set to true, the secret cannot be recovered. Valid values: true, false. Default to: false.
     * 
     */
    @Import(name="forceDeleteWithoutRecovery")
    private @Nullable Output<Boolean> forceDeleteWithoutRecovery;

    /**
     * @return Specifies whether to forcibly delete the secret. If this parameter is set to true, the secret cannot be recovered. Valid values: true, false. Default to: false.
     * 
     */
    public Optional<Output<Boolean>> forceDeleteWithoutRecovery() {
        return Optional.ofNullable(this.forceDeleteWithoutRecovery);
    }

    /**
     * Specifies the recovery period of the secret if you do not forcibly delete it. Default value: 30. It will be ignored when `force_delete_without_recovery` is true.
     * 
     */
    @Import(name="recoveryWindowInDays")
    private @Nullable Output<Integer> recoveryWindowInDays;

    /**
     * @return Specifies the recovery period of the secret if you do not forcibly delete it. Default value: 30. It will be ignored when `force_delete_without_recovery` is true.
     * 
     */
    public Optional<Output<Integer>> recoveryWindowInDays() {
        return Optional.ofNullable(this.recoveryWindowInDays);
    }

    /**
     * The time period of automatic rotation. The format is integer[unit], where integer represents the length of time, and unit represents the unit of time. The legal unit units are: d (day), h (hour), m (minute), s (second). 7d or 604800s both indicate a 7-day cycle.
     * 
     */
    @Import(name="rotationInterval")
    private @Nullable Output<String> rotationInterval;

    /**
     * @return The time period of automatic rotation. The format is integer[unit], where integer represents the length of time, and unit represents the unit of time. The legal unit units are: d (day), h (hour), m (minute), s (second). 7d or 604800s both indicate a 7-day cycle.
     * 
     */
    public Optional<Output<String>> rotationInterval() {
        return Optional.ofNullable(this.rotationInterval);
    }

    /**
     * The value of the secret that you want to create. Secrets Manager encrypts the secret value and stores it in the initial version.
     * 
     */
    @Import(name="secretData", required=true)
    private Output<String> secretData;

    /**
     * @return The value of the secret that you want to create. Secrets Manager encrypts the secret value and stores it in the initial version.
     * 
     */
    public Output<String> secretData() {
        return this.secretData;
    }

    /**
     * The type of the secret value. Valid values: text, binary. Default to &#34;text&#34;.
     * 
     */
    @Import(name="secretDataType")
    private @Nullable Output<String> secretDataType;

    /**
     * @return The type of the secret value. Valid values: text, binary. Default to &#34;text&#34;.
     * 
     */
    public Optional<Output<String>> secretDataType() {
        return Optional.ofNullable(this.secretDataType);
    }

    /**
     * The name of the secret.
     * 
     */
    @Import(name="secretName", required=true)
    private Output<String> secretName;

    /**
     * @return The name of the secret.
     * 
     */
    public Output<String> secretName() {
        return this.secretName;
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The version number of the initial version. Version numbers are unique in each secret object.
     * 
     */
    @Import(name="versionId", required=true)
    private Output<String> versionId;

    /**
     * @return The version number of the initial version. Version numbers are unique in each secret object.
     * 
     */
    public Output<String> versionId() {
        return this.versionId;
    }

    /**
     * ) The stage labels that mark the new secret version. If you do not specify this parameter, Secrets Manager marks it with &#34;ACSCurrent&#34;.
     * 
     */
    @Import(name="versionStages")
    private @Nullable Output<List<String>> versionStages;

    /**
     * @return ) The stage labels that mark the new secret version. If you do not specify this parameter, Secrets Manager marks it with &#34;ACSCurrent&#34;.
     * 
     */
    public Optional<Output<List<String>>> versionStages() {
        return Optional.ofNullable(this.versionStages);
    }

    private SecretArgs() {}

    private SecretArgs(SecretArgs $) {
        this.description = $.description;
        this.dkmsInstanceId = $.dkmsInstanceId;
        this.enableAutomaticRotation = $.enableAutomaticRotation;
        this.encryptionKeyId = $.encryptionKeyId;
        this.forceDeleteWithoutRecovery = $.forceDeleteWithoutRecovery;
        this.recoveryWindowInDays = $.recoveryWindowInDays;
        this.rotationInterval = $.rotationInterval;
        this.secretData = $.secretData;
        this.secretDataType = $.secretDataType;
        this.secretName = $.secretName;
        this.tags = $.tags;
        this.versionId = $.versionId;
        this.versionStages = $.versionStages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretArgs $;

        public Builder() {
            $ = new SecretArgs();
        }

        public Builder(SecretArgs defaults) {
            $ = new SecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the secret.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the secret.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param dkmsInstanceId The instance ID of the exclusive KMS instance.
         * 
         * @return builder
         * 
         */
        public Builder dkmsInstanceId(@Nullable Output<String> dkmsInstanceId) {
            $.dkmsInstanceId = dkmsInstanceId;
            return this;
        }

        /**
         * @param dkmsInstanceId The instance ID of the exclusive KMS instance.
         * 
         * @return builder
         * 
         */
        public Builder dkmsInstanceId(String dkmsInstanceId) {
            return dkmsInstanceId(Output.of(dkmsInstanceId));
        }

        /**
         * @param enableAutomaticRotation Whether to enable automatic key rotation.
         * 
         * @return builder
         * 
         */
        public Builder enableAutomaticRotation(@Nullable Output<Boolean> enableAutomaticRotation) {
            $.enableAutomaticRotation = enableAutomaticRotation;
            return this;
        }

        /**
         * @param enableAutomaticRotation Whether to enable automatic key rotation.
         * 
         * @return builder
         * 
         */
        public Builder enableAutomaticRotation(Boolean enableAutomaticRotation) {
            return enableAutomaticRotation(Output.of(enableAutomaticRotation));
        }

        /**
         * @param encryptionKeyId The ID of the KMS CMK that is used to encrypt the secret value. If you do not specify this parameter, Secrets Manager automatically creates an encryption key to encrypt the secret.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKeyId(@Nullable Output<String> encryptionKeyId) {
            $.encryptionKeyId = encryptionKeyId;
            return this;
        }

        /**
         * @param encryptionKeyId The ID of the KMS CMK that is used to encrypt the secret value. If you do not specify this parameter, Secrets Manager automatically creates an encryption key to encrypt the secret.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKeyId(String encryptionKeyId) {
            return encryptionKeyId(Output.of(encryptionKeyId));
        }

        /**
         * @param forceDeleteWithoutRecovery Specifies whether to forcibly delete the secret. If this parameter is set to true, the secret cannot be recovered. Valid values: true, false. Default to: false.
         * 
         * @return builder
         * 
         */
        public Builder forceDeleteWithoutRecovery(@Nullable Output<Boolean> forceDeleteWithoutRecovery) {
            $.forceDeleteWithoutRecovery = forceDeleteWithoutRecovery;
            return this;
        }

        /**
         * @param forceDeleteWithoutRecovery Specifies whether to forcibly delete the secret. If this parameter is set to true, the secret cannot be recovered. Valid values: true, false. Default to: false.
         * 
         * @return builder
         * 
         */
        public Builder forceDeleteWithoutRecovery(Boolean forceDeleteWithoutRecovery) {
            return forceDeleteWithoutRecovery(Output.of(forceDeleteWithoutRecovery));
        }

        /**
         * @param recoveryWindowInDays Specifies the recovery period of the secret if you do not forcibly delete it. Default value: 30. It will be ignored when `force_delete_without_recovery` is true.
         * 
         * @return builder
         * 
         */
        public Builder recoveryWindowInDays(@Nullable Output<Integer> recoveryWindowInDays) {
            $.recoveryWindowInDays = recoveryWindowInDays;
            return this;
        }

        /**
         * @param recoveryWindowInDays Specifies the recovery period of the secret if you do not forcibly delete it. Default value: 30. It will be ignored when `force_delete_without_recovery` is true.
         * 
         * @return builder
         * 
         */
        public Builder recoveryWindowInDays(Integer recoveryWindowInDays) {
            return recoveryWindowInDays(Output.of(recoveryWindowInDays));
        }

        /**
         * @param rotationInterval The time period of automatic rotation. The format is integer[unit], where integer represents the length of time, and unit represents the unit of time. The legal unit units are: d (day), h (hour), m (minute), s (second). 7d or 604800s both indicate a 7-day cycle.
         * 
         * @return builder
         * 
         */
        public Builder rotationInterval(@Nullable Output<String> rotationInterval) {
            $.rotationInterval = rotationInterval;
            return this;
        }

        /**
         * @param rotationInterval The time period of automatic rotation. The format is integer[unit], where integer represents the length of time, and unit represents the unit of time. The legal unit units are: d (day), h (hour), m (minute), s (second). 7d or 604800s both indicate a 7-day cycle.
         * 
         * @return builder
         * 
         */
        public Builder rotationInterval(String rotationInterval) {
            return rotationInterval(Output.of(rotationInterval));
        }

        /**
         * @param secretData The value of the secret that you want to create. Secrets Manager encrypts the secret value and stores it in the initial version.
         * 
         * @return builder
         * 
         */
        public Builder secretData(Output<String> secretData) {
            $.secretData = secretData;
            return this;
        }

        /**
         * @param secretData The value of the secret that you want to create. Secrets Manager encrypts the secret value and stores it in the initial version.
         * 
         * @return builder
         * 
         */
        public Builder secretData(String secretData) {
            return secretData(Output.of(secretData));
        }

        /**
         * @param secretDataType The type of the secret value. Valid values: text, binary. Default to &#34;text&#34;.
         * 
         * @return builder
         * 
         */
        public Builder secretDataType(@Nullable Output<String> secretDataType) {
            $.secretDataType = secretDataType;
            return this;
        }

        /**
         * @param secretDataType The type of the secret value. Valid values: text, binary. Default to &#34;text&#34;.
         * 
         * @return builder
         * 
         */
        public Builder secretDataType(String secretDataType) {
            return secretDataType(Output.of(secretDataType));
        }

        /**
         * @param secretName The name of the secret.
         * 
         * @return builder
         * 
         */
        public Builder secretName(Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        /**
         * @param secretName The name of the secret.
         * 
         * @return builder
         * 
         */
        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param versionId The version number of the initial version. Version numbers are unique in each secret object.
         * 
         * @return builder
         * 
         */
        public Builder versionId(Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        /**
         * @param versionId The version number of the initial version. Version numbers are unique in each secret object.
         * 
         * @return builder
         * 
         */
        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        /**
         * @param versionStages ) The stage labels that mark the new secret version. If you do not specify this parameter, Secrets Manager marks it with &#34;ACSCurrent&#34;.
         * 
         * @return builder
         * 
         */
        public Builder versionStages(@Nullable Output<List<String>> versionStages) {
            $.versionStages = versionStages;
            return this;
        }

        /**
         * @param versionStages ) The stage labels that mark the new secret version. If you do not specify this parameter, Secrets Manager marks it with &#34;ACSCurrent&#34;.
         * 
         * @return builder
         * 
         */
        public Builder versionStages(List<String> versionStages) {
            return versionStages(Output.of(versionStages));
        }

        /**
         * @param versionStages ) The stage labels that mark the new secret version. If you do not specify this parameter, Secrets Manager marks it with &#34;ACSCurrent&#34;.
         * 
         * @return builder
         * 
         */
        public Builder versionStages(String... versionStages) {
            return versionStages(List.of(versionStages));
        }

        public SecretArgs build() {
            $.secretData = Objects.requireNonNull($.secretData, "expected parameter 'secretData' to be non-null");
            $.secretName = Objects.requireNonNull($.secretName, "expected parameter 'secretName' to be non-null");
            $.versionId = Objects.requireNonNull($.versionId, "expected parameter 'versionId' to be non-null");
            return $;
        }
    }

}
