// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyArgs Empty = new KeyArgs();

    /**
     * Specifies whether to enable automatic key rotation. Valid values:
     * - Enabled
     * - Disabled (default value)
     *   **NOTE**: If you set the origin parameter to EXTERNAL or the key_spec parameter to an asymmetric CMK type, automatic key rotation is unavailable.
     * 
     */
    @Import(name="automaticRotation")
    private @Nullable Output<String> automaticRotation;

    /**
     * @return Specifies whether to enable automatic key rotation. Valid values:
     * - Enabled
     * - Disabled (default value)
     *   **NOTE**: If you set the origin parameter to EXTERNAL or the key_spec parameter to an asymmetric CMK type, automatic key rotation is unavailable.
     * 
     */
    public Optional<Output<String>> automaticRotation() {
        return Optional.ofNullable(this.automaticRotation);
    }

    /**
     * Field `deletion_window_in_days` has been deprecated from provider version 1.85.0. New field `pending_window_in_days` instead.
     * 
     * @deprecated
     * Field &#39;deletion_window_in_days&#39; has been deprecated from provider version 1.85.0. New field &#39;pending_window_in_days&#39; instead.
     * 
     */
    @Deprecated /* Field 'deletion_window_in_days' has been deprecated from provider version 1.85.0. New field 'pending_window_in_days' instead. */
    @Import(name="deletionWindowInDays")
    private @Nullable Output<Integer> deletionWindowInDays;

    /**
     * @return Field `deletion_window_in_days` has been deprecated from provider version 1.85.0. New field `pending_window_in_days` instead.
     * 
     * @deprecated
     * Field &#39;deletion_window_in_days&#39; has been deprecated from provider version 1.85.0. New field &#39;pending_window_in_days&#39; instead.
     * 
     */
    @Deprecated /* Field 'deletion_window_in_days' has been deprecated from provider version 1.85.0. New field 'pending_window_in_days' instead. */
    public Optional<Output<Integer>> deletionWindowInDays() {
        return Optional.ofNullable(this.deletionWindowInDays);
    }

    /**
     * The description of the CMK. The description can be 0 to 8,192 characters in length.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the CMK. The description can be 0 to 8,192 characters in length.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Field `is_enabled` has been deprecated from provider version 1.85.0. New field `key_state` instead.
     * 
     * @deprecated
     * Field &#39;is_enabled&#39; has been deprecated from provider version 1.85.0. New field &#39;key_state&#39; instead.
     * 
     */
    @Deprecated /* Field 'is_enabled' has been deprecated from provider version 1.85.0. New field 'key_state' instead. */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    /**
     * @return Field `is_enabled` has been deprecated from provider version 1.85.0. New field `key_state` instead.
     * 
     * @deprecated
     * Field &#39;is_enabled&#39; has been deprecated from provider version 1.85.0. New field &#39;key_state&#39; instead.
     * 
     */
    @Deprecated /* Field 'is_enabled' has been deprecated from provider version 1.85.0. New field 'key_state' instead. */
    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * The type of the CMK. Valid values:
     * &#34;Aliyun_AES_256&#34;, &#34;Aliyun_AES_128&#34;, &#34;Aliyun_AES_192&#34;, &#34;Aliyun_SM4&#34;, &#34;RSA_2048&#34;, &#34;RSA_3072&#34;, &#34;EC_P256&#34;, &#34;EC_P256K&#34;, &#34;EC_SM2&#34;.
     * Note: The default type of the CMK is Aliyun_AES_256. Only Dedicated KMS supports Aliyun_AES_128 and Aliyun_AES_192.
     * 
     */
    @Import(name="keySpec")
    private @Nullable Output<String> keySpec;

    /**
     * @return The type of the CMK. Valid values:
     * &#34;Aliyun_AES_256&#34;, &#34;Aliyun_AES_128&#34;, &#34;Aliyun_AES_192&#34;, &#34;Aliyun_SM4&#34;, &#34;RSA_2048&#34;, &#34;RSA_3072&#34;, &#34;EC_P256&#34;, &#34;EC_P256K&#34;, &#34;EC_SM2&#34;.
     * Note: The default type of the CMK is Aliyun_AES_256. Only Dedicated KMS supports Aliyun_AES_128 and Aliyun_AES_192.
     * 
     */
    public Optional<Output<String>> keySpec() {
        return Optional.ofNullable(this.keySpec);
    }

    /**
     * Field `key_state` has been deprecated from provider version 1.123.1. New field `status` instead.
     * 
     * @deprecated
     * Field &#39;key_state&#39; has been deprecated from provider version 1.123.1. New field &#39;status&#39; instead.
     * 
     */
    @Deprecated /* Field 'key_state' has been deprecated from provider version 1.123.1. New field 'status' instead. */
    @Import(name="keyState")
    private @Nullable Output<String> keyState;

    /**
     * @return Field `key_state` has been deprecated from provider version 1.123.1. New field `status` instead.
     * 
     * @deprecated
     * Field &#39;key_state&#39; has been deprecated from provider version 1.123.1. New field &#39;status&#39; instead.
     * 
     */
    @Deprecated /* Field 'key_state' has been deprecated from provider version 1.123.1. New field 'status' instead. */
    public Optional<Output<String>> keyState() {
        return Optional.ofNullable(this.keyState);
    }

    /**
     * The usage of the CMK. Valid values:
     * - ENCRYPT/DECRYPT(default value): encrypts or decrypts data.
     * - SIGN/VERIFY: generates or verifies a digital signature.
     * 
     */
    @Import(name="keyUsage")
    private @Nullable Output<String> keyUsage;

    /**
     * @return The usage of the CMK. Valid values:
     * - ENCRYPT/DECRYPT(default value): encrypts or decrypts data.
     * - SIGN/VERIFY: generates or verifies a digital signature.
     * 
     */
    public Optional<Output<String>> keyUsage() {
        return Optional.ofNullable(this.keyUsage);
    }

    /**
     * The source of key material. Valid values:
     * - Aliyun_KMS (default value)
     * - EXTERNAL
     *   **NOTE**: The value of this parameter is case-sensitive. If you set the `key_spec` to an asymmetric CMK type,
     *   you are not allowed to set the `origin` to EXTERNAL. If you set the `origin` to EXTERNAL, you must import key material.
     *   For more information, see [import key material](https://www.alibabacloud.com/help/en/doc-detail/68523.htm).
     * 
     */
    @Import(name="origin")
    private @Nullable Output<String> origin;

    /**
     * @return The source of key material. Valid values:
     * - Aliyun_KMS (default value)
     * - EXTERNAL
     *   **NOTE**: The value of this parameter is case-sensitive. If you set the `key_spec` to an asymmetric CMK type,
     *   you are not allowed to set the `origin` to EXTERNAL. If you set the `origin` to EXTERNAL, you must import key material.
     *   For more information, see [import key material](https://www.alibabacloud.com/help/en/doc-detail/68523.htm).
     * 
     */
    public Optional<Output<String>> origin() {
        return Optional.ofNullable(this.origin);
    }

    /**
     * The number of days before the CMK is deleted.
     * During this period, the CMK is in the PendingDeletion state.
     * After this period ends, you cannot cancel the deletion. Valid values: 7 to 30. Unit: days.
     * 
     */
    @Import(name="pendingWindowInDays")
    private @Nullable Output<Integer> pendingWindowInDays;

    /**
     * @return The number of days before the CMK is deleted.
     * During this period, the CMK is in the PendingDeletion state.
     * After this period ends, you cannot cancel the deletion. Valid values: 7 to 30. Unit: days.
     * 
     */
    public Optional<Output<Integer>> pendingWindowInDays() {
        return Optional.ofNullable(this.pendingWindowInDays);
    }

    /**
     * The protection level of the CMK. Valid values:
     * - SOFTWARE (default value)
     * - HSM
     *   **NOTE**: The value of this parameter is case-sensitive. Assume that you set this parameter to HSM.
     *   If you set the origin parameter to Aliyun_KMS, the CMK is created in a managed hardware security module (HSM).
     *   If you set the origin parameter to EXTERNA, you can import an external key to the managed HSM.
     * 
     */
    @Import(name="protectionLevel")
    private @Nullable Output<String> protectionLevel;

    /**
     * @return The protection level of the CMK. Valid values:
     * - SOFTWARE (default value)
     * - HSM
     *   **NOTE**: The value of this parameter is case-sensitive. Assume that you set this parameter to HSM.
     *   If you set the origin parameter to Aliyun_KMS, the CMK is created in a managed hardware security module (HSM).
     *   If you set the origin parameter to EXTERNA, you can import an external key to the managed HSM.
     * 
     */
    public Optional<Output<String>> protectionLevel() {
        return Optional.ofNullable(this.protectionLevel);
    }

    /**
     * The interval for automatic key rotation. Specify the value in the integer[unit] format.
     * The following units are supported: d (day), h (hour), m (minute), and s (second).
     * For example, you can use either 7d or 604800s to specify a seven-day interval.
     * The interval can range from 7 days to 730 days.
     * **NOTE**: It is Required when `automatic_rotation = &#34;Enabled&#34;`
     * 
     */
    @Import(name="rotationInterval")
    private @Nullable Output<String> rotationInterval;

    /**
     * @return The interval for automatic key rotation. Specify the value in the integer[unit] format.
     * The following units are supported: d (day), h (hour), m (minute), and s (second).
     * For example, you can use either 7d or 604800s to specify a seven-day interval.
     * The interval can range from 7 days to 730 days.
     * **NOTE**: It is Required when `automatic_rotation = &#34;Enabled&#34;`
     * 
     */
    public Optional<Output<String>> rotationInterval() {
        return Optional.ofNullable(this.rotationInterval);
    }

    /**
     * The status of CMK. Valid Values:
     * - Disabled
     * - Enabled (default value)
     * - PendingDeletion
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of CMK. Valid Values:
     * - Disabled
     * - Enabled (default value)
     * - PendingDeletion
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private KeyArgs() {}

    private KeyArgs(KeyArgs $) {
        this.automaticRotation = $.automaticRotation;
        this.deletionWindowInDays = $.deletionWindowInDays;
        this.description = $.description;
        this.isEnabled = $.isEnabled;
        this.keySpec = $.keySpec;
        this.keyState = $.keyState;
        this.keyUsage = $.keyUsage;
        this.origin = $.origin;
        this.pendingWindowInDays = $.pendingWindowInDays;
        this.protectionLevel = $.protectionLevel;
        this.rotationInterval = $.rotationInterval;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyArgs $;

        public Builder() {
            $ = new KeyArgs();
        }

        public Builder(KeyArgs defaults) {
            $ = new KeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automaticRotation Specifies whether to enable automatic key rotation. Valid values:
         * - Enabled
         * - Disabled (default value)
         *   **NOTE**: If you set the origin parameter to EXTERNAL or the key_spec parameter to an asymmetric CMK type, automatic key rotation is unavailable.
         * 
         * @return builder
         * 
         */
        public Builder automaticRotation(@Nullable Output<String> automaticRotation) {
            $.automaticRotation = automaticRotation;
            return this;
        }

        /**
         * @param automaticRotation Specifies whether to enable automatic key rotation. Valid values:
         * - Enabled
         * - Disabled (default value)
         *   **NOTE**: If you set the origin parameter to EXTERNAL or the key_spec parameter to an asymmetric CMK type, automatic key rotation is unavailable.
         * 
         * @return builder
         * 
         */
        public Builder automaticRotation(String automaticRotation) {
            return automaticRotation(Output.of(automaticRotation));
        }

        /**
         * @param deletionWindowInDays Field `deletion_window_in_days` has been deprecated from provider version 1.85.0. New field `pending_window_in_days` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;deletion_window_in_days&#39; has been deprecated from provider version 1.85.0. New field &#39;pending_window_in_days&#39; instead.
         * 
         */
        @Deprecated /* Field 'deletion_window_in_days' has been deprecated from provider version 1.85.0. New field 'pending_window_in_days' instead. */
        public Builder deletionWindowInDays(@Nullable Output<Integer> deletionWindowInDays) {
            $.deletionWindowInDays = deletionWindowInDays;
            return this;
        }

        /**
         * @param deletionWindowInDays Field `deletion_window_in_days` has been deprecated from provider version 1.85.0. New field `pending_window_in_days` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;deletion_window_in_days&#39; has been deprecated from provider version 1.85.0. New field &#39;pending_window_in_days&#39; instead.
         * 
         */
        @Deprecated /* Field 'deletion_window_in_days' has been deprecated from provider version 1.85.0. New field 'pending_window_in_days' instead. */
        public Builder deletionWindowInDays(Integer deletionWindowInDays) {
            return deletionWindowInDays(Output.of(deletionWindowInDays));
        }

        /**
         * @param description The description of the CMK. The description can be 0 to 8,192 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the CMK. The description can be 0 to 8,192 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param isEnabled Field `is_enabled` has been deprecated from provider version 1.85.0. New field `key_state` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;is_enabled&#39; has been deprecated from provider version 1.85.0. New field &#39;key_state&#39; instead.
         * 
         */
        @Deprecated /* Field 'is_enabled' has been deprecated from provider version 1.85.0. New field 'key_state' instead. */
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Field `is_enabled` has been deprecated from provider version 1.85.0. New field `key_state` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;is_enabled&#39; has been deprecated from provider version 1.85.0. New field &#39;key_state&#39; instead.
         * 
         */
        @Deprecated /* Field 'is_enabled' has been deprecated from provider version 1.85.0. New field 'key_state' instead. */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param keySpec The type of the CMK. Valid values:
         * &#34;Aliyun_AES_256&#34;, &#34;Aliyun_AES_128&#34;, &#34;Aliyun_AES_192&#34;, &#34;Aliyun_SM4&#34;, &#34;RSA_2048&#34;, &#34;RSA_3072&#34;, &#34;EC_P256&#34;, &#34;EC_P256K&#34;, &#34;EC_SM2&#34;.
         * Note: The default type of the CMK is Aliyun_AES_256. Only Dedicated KMS supports Aliyun_AES_128 and Aliyun_AES_192.
         * 
         * @return builder
         * 
         */
        public Builder keySpec(@Nullable Output<String> keySpec) {
            $.keySpec = keySpec;
            return this;
        }

        /**
         * @param keySpec The type of the CMK. Valid values:
         * &#34;Aliyun_AES_256&#34;, &#34;Aliyun_AES_128&#34;, &#34;Aliyun_AES_192&#34;, &#34;Aliyun_SM4&#34;, &#34;RSA_2048&#34;, &#34;RSA_3072&#34;, &#34;EC_P256&#34;, &#34;EC_P256K&#34;, &#34;EC_SM2&#34;.
         * Note: The default type of the CMK is Aliyun_AES_256. Only Dedicated KMS supports Aliyun_AES_128 and Aliyun_AES_192.
         * 
         * @return builder
         * 
         */
        public Builder keySpec(String keySpec) {
            return keySpec(Output.of(keySpec));
        }

        /**
         * @param keyState Field `key_state` has been deprecated from provider version 1.123.1. New field `status` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;key_state&#39; has been deprecated from provider version 1.123.1. New field &#39;status&#39; instead.
         * 
         */
        @Deprecated /* Field 'key_state' has been deprecated from provider version 1.123.1. New field 'status' instead. */
        public Builder keyState(@Nullable Output<String> keyState) {
            $.keyState = keyState;
            return this;
        }

        /**
         * @param keyState Field `key_state` has been deprecated from provider version 1.123.1. New field `status` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;key_state&#39; has been deprecated from provider version 1.123.1. New field &#39;status&#39; instead.
         * 
         */
        @Deprecated /* Field 'key_state' has been deprecated from provider version 1.123.1. New field 'status' instead. */
        public Builder keyState(String keyState) {
            return keyState(Output.of(keyState));
        }

        /**
         * @param keyUsage The usage of the CMK. Valid values:
         * - ENCRYPT/DECRYPT(default value): encrypts or decrypts data.
         * - SIGN/VERIFY: generates or verifies a digital signature.
         * 
         * @return builder
         * 
         */
        public Builder keyUsage(@Nullable Output<String> keyUsage) {
            $.keyUsage = keyUsage;
            return this;
        }

        /**
         * @param keyUsage The usage of the CMK. Valid values:
         * - ENCRYPT/DECRYPT(default value): encrypts or decrypts data.
         * - SIGN/VERIFY: generates or verifies a digital signature.
         * 
         * @return builder
         * 
         */
        public Builder keyUsage(String keyUsage) {
            return keyUsage(Output.of(keyUsage));
        }

        /**
         * @param origin The source of key material. Valid values:
         * - Aliyun_KMS (default value)
         * - EXTERNAL
         *   **NOTE**: The value of this parameter is case-sensitive. If you set the `key_spec` to an asymmetric CMK type,
         *   you are not allowed to set the `origin` to EXTERNAL. If you set the `origin` to EXTERNAL, you must import key material.
         *   For more information, see [import key material](https://www.alibabacloud.com/help/en/doc-detail/68523.htm).
         * 
         * @return builder
         * 
         */
        public Builder origin(@Nullable Output<String> origin) {
            $.origin = origin;
            return this;
        }

        /**
         * @param origin The source of key material. Valid values:
         * - Aliyun_KMS (default value)
         * - EXTERNAL
         *   **NOTE**: The value of this parameter is case-sensitive. If you set the `key_spec` to an asymmetric CMK type,
         *   you are not allowed to set the `origin` to EXTERNAL. If you set the `origin` to EXTERNAL, you must import key material.
         *   For more information, see [import key material](https://www.alibabacloud.com/help/en/doc-detail/68523.htm).
         * 
         * @return builder
         * 
         */
        public Builder origin(String origin) {
            return origin(Output.of(origin));
        }

        /**
         * @param pendingWindowInDays The number of days before the CMK is deleted.
         * During this period, the CMK is in the PendingDeletion state.
         * After this period ends, you cannot cancel the deletion. Valid values: 7 to 30. Unit: days.
         * 
         * @return builder
         * 
         */
        public Builder pendingWindowInDays(@Nullable Output<Integer> pendingWindowInDays) {
            $.pendingWindowInDays = pendingWindowInDays;
            return this;
        }

        /**
         * @param pendingWindowInDays The number of days before the CMK is deleted.
         * During this period, the CMK is in the PendingDeletion state.
         * After this period ends, you cannot cancel the deletion. Valid values: 7 to 30. Unit: days.
         * 
         * @return builder
         * 
         */
        public Builder pendingWindowInDays(Integer pendingWindowInDays) {
            return pendingWindowInDays(Output.of(pendingWindowInDays));
        }

        /**
         * @param protectionLevel The protection level of the CMK. Valid values:
         * - SOFTWARE (default value)
         * - HSM
         *   **NOTE**: The value of this parameter is case-sensitive. Assume that you set this parameter to HSM.
         *   If you set the origin parameter to Aliyun_KMS, the CMK is created in a managed hardware security module (HSM).
         *   If you set the origin parameter to EXTERNA, you can import an external key to the managed HSM.
         * 
         * @return builder
         * 
         */
        public Builder protectionLevel(@Nullable Output<String> protectionLevel) {
            $.protectionLevel = protectionLevel;
            return this;
        }

        /**
         * @param protectionLevel The protection level of the CMK. Valid values:
         * - SOFTWARE (default value)
         * - HSM
         *   **NOTE**: The value of this parameter is case-sensitive. Assume that you set this parameter to HSM.
         *   If you set the origin parameter to Aliyun_KMS, the CMK is created in a managed hardware security module (HSM).
         *   If you set the origin parameter to EXTERNA, you can import an external key to the managed HSM.
         * 
         * @return builder
         * 
         */
        public Builder protectionLevel(String protectionLevel) {
            return protectionLevel(Output.of(protectionLevel));
        }

        /**
         * @param rotationInterval The interval for automatic key rotation. Specify the value in the integer[unit] format.
         * The following units are supported: d (day), h (hour), m (minute), and s (second).
         * For example, you can use either 7d or 604800s to specify a seven-day interval.
         * The interval can range from 7 days to 730 days.
         * **NOTE**: It is Required when `automatic_rotation = &#34;Enabled&#34;`
         * 
         * @return builder
         * 
         */
        public Builder rotationInterval(@Nullable Output<String> rotationInterval) {
            $.rotationInterval = rotationInterval;
            return this;
        }

        /**
         * @param rotationInterval The interval for automatic key rotation. Specify the value in the integer[unit] format.
         * The following units are supported: d (day), h (hour), m (minute), and s (second).
         * For example, you can use either 7d or 604800s to specify a seven-day interval.
         * The interval can range from 7 days to 730 days.
         * **NOTE**: It is Required when `automatic_rotation = &#34;Enabled&#34;`
         * 
         * @return builder
         * 
         */
        public Builder rotationInterval(String rotationInterval) {
            return rotationInterval(Output.of(rotationInterval));
        }

        /**
         * @param status The status of CMK. Valid Values:
         * - Disabled
         * - Enabled (default value)
         * - PendingDeletion
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of CMK. Valid Values:
         * - Disabled
         * - Enabled (default value)
         * - PendingDeletion
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public KeyArgs build() {
            return $;
        }
    }

}
