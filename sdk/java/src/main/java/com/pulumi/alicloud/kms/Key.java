// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.kms.KeyArgs;
import com.pulumi.alicloud.kms.inputs.KeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A kms key can help user to protect data security in the transmission process. For information about Alikms Key and how to use it, see [What is Resource Alikms Key](https://www.alibabacloud.com/help/doc-detail/28947.htm).
 * 
 * &gt; **NOTE:** Available in v1.85.0+.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.kms.Key;
 * import com.pulumi.alicloud.kms.KeyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var key = new Key(&#34;key&#34;, KeyArgs.builder()        
 *             .description(&#34;Hello KMS&#34;)
 *             .pendingWindowInDays(&#34;7&#34;)
 *             .status(&#34;Enabled&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Alikms key can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:kms/key:Key example abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:kms/key:Key")
public class Key extends com.pulumi.resources.CustomResource {
    /**
     * The Alicloud Resource Name (ARN) of the key.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Alicloud Resource Name (ARN) of the key.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies whether to enable automatic key rotation. Valid values:
     * - Enabled
     * - Disabled (default value)
     *   **NOTE**: If you set the origin parameter to EXTERNAL or the key_spec parameter to an asymmetric CMK type, automatic key rotation is unavailable.
     * 
     */
    @Export(name="automaticRotation", type=String.class, parameters={})
    private Output</* @Nullable */ String> automaticRotation;

    /**
     * @return Specifies whether to enable automatic key rotation. Valid values:
     * - Enabled
     * - Disabled (default value)
     *   **NOTE**: If you set the origin parameter to EXTERNAL or the key_spec parameter to an asymmetric CMK type, automatic key rotation is unavailable.
     * 
     */
    public Output<Optional<String>> automaticRotation() {
        return Codegen.optional(this.automaticRotation);
    }
    /**
     * The date and time when the CMK was created. The time is displayed in UTC.
     * 
     */
    @Export(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The date and time when the CMK was created. The time is displayed in UTC.
     * 
     */
    public Output<String> creationDate() {
        return this.creationDate;
    }
    /**
     * The creator of the CMK.
     * 
     */
    @Export(name="creator", type=String.class, parameters={})
    private Output<String> creator;

    /**
     * @return The creator of the CMK.
     * 
     */
    public Output<String> creator() {
        return this.creator;
    }
    /**
     * The scheduled date to delete CMK. The time is displayed in UTC. This value is returned only when the KeyState value is PendingDeletion.
     * 
     */
    @Export(name="deleteDate", type=String.class, parameters={})
    private Output<String> deleteDate;

    /**
     * @return The scheduled date to delete CMK. The time is displayed in UTC. This value is returned only when the KeyState value is PendingDeletion.
     * 
     */
    public Output<String> deleteDate() {
        return this.deleteDate;
    }
    /**
     * Field `deletion_window_in_days` has been deprecated from provider version 1.85.0. New field `pending_window_in_days` instead.
     * 
     * @deprecated
     * Field &#39;deletion_window_in_days&#39; has been deprecated from provider version 1.85.0. New field &#39;pending_window_in_days&#39; instead.
     * 
     */
    @Deprecated /* Field 'deletion_window_in_days' has been deprecated from provider version 1.85.0. New field 'pending_window_in_days' instead. */
    @Export(name="deletionWindowInDays", type=Integer.class, parameters={})
    private Output<Integer> deletionWindowInDays;

    /**
     * @return Field `deletion_window_in_days` has been deprecated from provider version 1.85.0. New field `pending_window_in_days` instead.
     * 
     */
    public Output<Integer> deletionWindowInDays() {
        return this.deletionWindowInDays;
    }
    /**
     * The description of the CMK. The description can be 0 to 8,192 characters in length.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the CMK. The description can be 0 to 8,192 characters in length.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The instance ID of the exclusive KMS instance.
     * 
     */
    @Export(name="dkmsInstanceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> dkmsInstanceId;

    /**
     * @return The instance ID of the exclusive KMS instance.
     * 
     */
    public Output<Optional<String>> dkmsInstanceId() {
        return Codegen.optional(this.dkmsInstanceId);
    }
    /**
     * Field `is_enabled` has been deprecated from provider version 1.85.0. New field `key_state` instead.
     * 
     * @deprecated
     * Field &#39;is_enabled&#39; has been deprecated from provider version 1.85.0. New field &#39;key_state&#39; instead.
     * 
     */
    @Deprecated /* Field 'is_enabled' has been deprecated from provider version 1.85.0. New field 'key_state' instead. */
    @Export(name="isEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isEnabled;

    /**
     * @return Field `is_enabled` has been deprecated from provider version 1.85.0. New field `key_state` instead.
     * 
     */
    public Output<Optional<Boolean>> isEnabled() {
        return Codegen.optional(this.isEnabled);
    }
    /**
     * The type of the CMK. Valid values:
     * &#34;Aliyun_AES_256&#34;, &#34;Aliyun_AES_128&#34;, &#34;Aliyun_AES_192&#34;, &#34;Aliyun_SM4&#34;, &#34;RSA_2048&#34;, &#34;RSA_3072&#34;, &#34;EC_P256&#34;, &#34;EC_P256K&#34;, &#34;EC_SM2&#34;.
     * Note: The default type of the CMK is Aliyun_AES_256. Only Dedicated KMS supports Aliyun_AES_128 and Aliyun_AES_192.
     * 
     */
    @Export(name="keySpec", type=String.class, parameters={})
    private Output<String> keySpec;

    /**
     * @return The type of the CMK. Valid values:
     * &#34;Aliyun_AES_256&#34;, &#34;Aliyun_AES_128&#34;, &#34;Aliyun_AES_192&#34;, &#34;Aliyun_SM4&#34;, &#34;RSA_2048&#34;, &#34;RSA_3072&#34;, &#34;EC_P256&#34;, &#34;EC_P256K&#34;, &#34;EC_SM2&#34;.
     * Note: The default type of the CMK is Aliyun_AES_256. Only Dedicated KMS supports Aliyun_AES_128 and Aliyun_AES_192.
     * 
     */
    public Output<String> keySpec() {
        return this.keySpec;
    }
    /**
     * Field `key_state` has been deprecated from provider version 1.123.1. New field `status` instead.
     * 
     * @deprecated
     * Field &#39;key_state&#39; has been deprecated from provider version 1.123.1. New field &#39;status&#39; instead.
     * 
     */
    @Deprecated /* Field 'key_state' has been deprecated from provider version 1.123.1. New field 'status' instead. */
    @Export(name="keyState", type=String.class, parameters={})
    private Output<String> keyState;

    /**
     * @return Field `key_state` has been deprecated from provider version 1.123.1. New field `status` instead.
     * 
     */
    public Output<String> keyState() {
        return this.keyState;
    }
    /**
     * The usage of the CMK. Valid values:
     * - ENCRYPT/DECRYPT(default value): encrypts or decrypts data.
     * - SIGN/VERIFY: generates or verifies a digital signature.
     * 
     */
    @Export(name="keyUsage", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyUsage;

    /**
     * @return The usage of the CMK. Valid values:
     * - ENCRYPT/DECRYPT(default value): encrypts or decrypts data.
     * - SIGN/VERIFY: generates or verifies a digital signature.
     * 
     */
    public Output<Optional<String>> keyUsage() {
        return Codegen.optional(this.keyUsage);
    }
    /**
     * The date and time the last rotation was performed. The time is displayed in UTC.
     * 
     */
    @Export(name="lastRotationDate", type=String.class, parameters={})
    private Output<String> lastRotationDate;

    /**
     * @return The date and time the last rotation was performed. The time is displayed in UTC.
     * 
     */
    public Output<String> lastRotationDate() {
        return this.lastRotationDate;
    }
    /**
     * The time and date the key material for the CMK expires. The time is displayed in UTC. If the value is empty, the key material for the CMK does not expire.
     * 
     */
    @Export(name="materialExpireTime", type=String.class, parameters={})
    private Output<String> materialExpireTime;

    /**
     * @return The time and date the key material for the CMK expires. The time is displayed in UTC. If the value is empty, the key material for the CMK does not expire.
     * 
     */
    public Output<String> materialExpireTime() {
        return this.materialExpireTime;
    }
    /**
     * The time the next rotation is scheduled for execution.
     * 
     */
    @Export(name="nextRotationDate", type=String.class, parameters={})
    private Output<String> nextRotationDate;

    /**
     * @return The time the next rotation is scheduled for execution.
     * 
     */
    public Output<String> nextRotationDate() {
        return this.nextRotationDate;
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
    @Export(name="origin", type=String.class, parameters={})
    private Output<String> origin;

    /**
     * @return The source of key material. Valid values:
     * - Aliyun_KMS (default value)
     * - EXTERNAL
     *   **NOTE**: The value of this parameter is case-sensitive. If you set the `key_spec` to an asymmetric CMK type,
     *   you are not allowed to set the `origin` to EXTERNAL. If you set the `origin` to EXTERNAL, you must import key material.
     *   For more information, see [import key material](https://www.alibabacloud.com/help/en/doc-detail/68523.htm).
     * 
     */
    public Output<String> origin() {
        return this.origin;
    }
    /**
     * The number of days before the CMK is deleted.
     * During this period, the CMK is in the PendingDeletion state.
     * After this period ends, you cannot cancel the deletion. Valid values: 7 to 366. Unit: days.
     * **NOTE:** From version 1.184.0, `pending_window_in_days` can be set to `366`.
     * 
     */
    @Export(name="pendingWindowInDays", type=Integer.class, parameters={})
    private Output<Integer> pendingWindowInDays;

    /**
     * @return The number of days before the CMK is deleted.
     * During this period, the CMK is in the PendingDeletion state.
     * After this period ends, you cannot cancel the deletion. Valid values: 7 to 366. Unit: days.
     * **NOTE:** From version 1.184.0, `pending_window_in_days` can be set to `366`.
     * 
     */
    public Output<Integer> pendingWindowInDays() {
        return this.pendingWindowInDays;
    }
    /**
     * The ID of the current primary key version of the symmetric CMK.
     * 
     */
    @Export(name="primaryKeyVersion", type=String.class, parameters={})
    private Output<String> primaryKeyVersion;

    /**
     * @return The ID of the current primary key version of the symmetric CMK.
     * 
     */
    public Output<String> primaryKeyVersion() {
        return this.primaryKeyVersion;
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
    @Export(name="protectionLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> protectionLevel;

    /**
     * @return The protection level of the CMK. Valid values:
     * - SOFTWARE (default value)
     * - HSM
     *   **NOTE**: The value of this parameter is case-sensitive. Assume that you set this parameter to HSM.
     *   If you set the origin parameter to Aliyun_KMS, the CMK is created in a managed hardware security module (HSM).
     *   If you set the origin parameter to EXTERNA, you can import an external key to the managed HSM.
     * 
     */
    public Output<Optional<String>> protectionLevel() {
        return Codegen.optional(this.protectionLevel);
    }
    /**
     * The interval for automatic key rotation. Specify the value in the integer[unit] format.
     * The following units are supported: d (day), h (hour), m (minute), and s (second).
     * For example, you can use either 7d or 604800s to specify a seven-day interval.
     * The interval can range from 7 days to 730 days.
     * **NOTE**: It is Required when `automatic_rotation = &#34;Enabled&#34;`
     * 
     */
    @Export(name="rotationInterval", type=String.class, parameters={})
    private Output</* @Nullable */ String> rotationInterval;

    /**
     * @return The interval for automatic key rotation. Specify the value in the integer[unit] format.
     * The following units are supported: d (day), h (hour), m (minute), and s (second).
     * For example, you can use either 7d or 604800s to specify a seven-day interval.
     * The interval can range from 7 days to 730 days.
     * **NOTE**: It is Required when `automatic_rotation = &#34;Enabled&#34;`
     * 
     */
    public Output<Optional<String>> rotationInterval() {
        return Codegen.optional(this.rotationInterval);
    }
    /**
     * The status of CMK. Valid Values:
     * - Disabled
     * - Enabled (default value)
     * - PendingDeletion
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of CMK. Valid Values:
     * - Disabled
     * - Enabled (default value)
     * - PendingDeletion
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Key(String name) {
        this(name, KeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Key(String name, @Nullable KeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Key(String name, @Nullable KeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:kms/key:Key", name, args == null ? KeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Key(String name, Output<String> id, @Nullable KeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:kms/key:Key", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Key get(String name, Output<String> id, @Nullable KeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Key(name, id, state, options);
    }
}
