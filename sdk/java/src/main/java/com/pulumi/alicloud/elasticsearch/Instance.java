// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.elasticsearch;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.elasticsearch.InstanceArgs;
import com.pulumi.alicloud.elasticsearch.inputs.InstanceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Elasticsearch instance resource. It contains data nodes, dedicated master node(optional) and etc. It can be associated with private IP whitelists and kibana IP whitelist.
 * 
 * &gt; **NOTE:** Only one operation is supported in a request. So if `data_node_spec` and `data_node_disk_size` are both changed, system will respond error.
 * 
 * &gt; **NOTE:** At present, `version` can not be modified once instance has been created.
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
 * import com.pulumi.alicloud.elasticsearch.Instance;
 * import com.pulumi.alicloud.elasticsearch.InstanceArgs;
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
 *         var instance = new Instance(&#34;instance&#34;, InstanceArgs.builder()        
 *             .clientNodeAmount(&#34;2&#34;)
 *             .clientNodeSpec(&#34;elasticsearch.sn2ne.large&#34;)
 *             .dataNodeAmount(&#34;2&#34;)
 *             .dataNodeDiskSize(&#34;20&#34;)
 *             .dataNodeDiskType(&#34;cloud_ssd&#34;)
 *             .dataNodeSpec(&#34;elasticsearch.sn2ne.large&#34;)
 *             .description(&#34;description&#34;)
 *             .instanceChargeType(&#34;PostPaid&#34;)
 *             .password(&#34;Your password&#34;)
 *             .protocol(&#34;HTTPS&#34;)
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;key1&#34;, &#34;value1&#34;),
 *                 Map.entry(&#34;key2&#34;, &#34;value2&#34;)
 *             ))
 *             .version(&#34;5.5.3_with_X-Pack&#34;)
 *             .vswitchId(&#34;some vswitch id&#34;)
 *             .zoneCount(&#34;2&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Elasticsearch can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:elasticsearch/instance:Instance example es-cn-abcde123456
 * ```
 * 
 */
@ResourceType(type="alicloud:elasticsearch/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * The Elasticsearch cluster&#39;s client node quantity, between 2 and 25.
     * 
     */
    @Export(name="clientNodeAmount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> clientNodeAmount;

    /**
     * @return The Elasticsearch cluster&#39;s client node quantity, between 2 and 25.
     * 
     */
    public Output<Optional<Integer>> clientNodeAmount() {
        return Codegen.optional(this.clientNodeAmount);
    }
    /**
     * The client node spec. If specified, client node will be created.
     * 
     */
    @Export(name="clientNodeSpec", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientNodeSpec;

    /**
     * @return The client node spec. If specified, client node will be created.
     * 
     */
    public Output<Optional<String>> clientNodeSpec() {
        return Codegen.optional(this.clientNodeSpec);
    }
    /**
     * The Elasticsearch cluster&#39;s data node quantity, between 2 and 50.
     * 
     */
    @Export(name="dataNodeAmount", type=Integer.class, parameters={})
    private Output<Integer> dataNodeAmount;

    /**
     * @return The Elasticsearch cluster&#39;s data node quantity, between 2 and 50.
     * 
     */
    public Output<Integer> dataNodeAmount() {
        return this.dataNodeAmount;
    }
    /**
     * If encrypt the data node disk. Valid values are `true`, `false`. Default to `false`.
     * 
     */
    @Export(name="dataNodeDiskEncrypted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> dataNodeDiskEncrypted;

    /**
     * @return If encrypt the data node disk. Valid values are `true`, `false`. Default to `false`.
     * 
     */
    public Output<Optional<Boolean>> dataNodeDiskEncrypted() {
        return Codegen.optional(this.dataNodeDiskEncrypted);
    }
    /**
     * The single data node storage space.
     * 
     */
    @Export(name="dataNodeDiskSize", type=Integer.class, parameters={})
    private Output<Integer> dataNodeDiskSize;

    /**
     * @return The single data node storage space.
     * 
     */
    public Output<Integer> dataNodeDiskSize() {
        return this.dataNodeDiskSize;
    }
    /**
     * The data node disk type. Supported values: cloud_ssd, cloud_efficiency.
     * 
     */
    @Export(name="dataNodeDiskType", type=String.class, parameters={})
    private Output<String> dataNodeDiskType;

    /**
     * @return The data node disk type. Supported values: cloud_ssd, cloud_efficiency.
     * 
     */
    public Output<String> dataNodeDiskType() {
        return this.dataNodeDiskType;
    }
    /**
     * The data node specifications of the Elasticsearch instance.
     * 
     */
    @Export(name="dataNodeSpec", type=String.class, parameters={})
    private Output<String> dataNodeSpec;

    /**
     * @return The data node specifications of the Elasticsearch instance.
     * 
     */
    public Output<String> dataNodeSpec() {
        return this.dataNodeSpec;
    }
    /**
     * The description of instance. It a string of 0 to 30 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of instance. It a string of 0 to 30 characters.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Instance connection domain (only VPC network access supported).
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return Instance connection domain (only VPC network access supported).
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * Bool, default to false. When it set to true, the instance can close kibana private network access。
     * 
     */
    @Export(name="enableKibanaPrivateNetwork", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableKibanaPrivateNetwork;

    /**
     * @return Bool, default to false. When it set to true, the instance can close kibana private network access。
     * 
     */
    public Output<Optional<Boolean>> enableKibanaPrivateNetwork() {
        return Codegen.optional(this.enableKibanaPrivateNetwork);
    }
    /**
     * Bool, default to true. When it set to false, the instance can enable kibana public network access。
     * 
     */
    @Export(name="enableKibanaPublicNetwork", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableKibanaPublicNetwork;

    /**
     * @return Bool, default to true. When it set to false, the instance can enable kibana public network access。
     * 
     */
    public Output<Optional<Boolean>> enableKibanaPublicNetwork() {
        return Codegen.optional(this.enableKibanaPublicNetwork);
    }
    /**
     * Bool, default to false. When it set to true, the instance can enable public network access。
     * 
     */
    @Export(name="enablePublic", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enablePublic;

    /**
     * @return Bool, default to false. When it set to true, the instance can enable public network access。
     * 
     */
    public Output<Optional<Boolean>> enablePublic() {
        return Codegen.optional(this.enablePublic);
    }
    /**
     * Valid values are `PrePaid`, `PostPaid`. Default to `PostPaid`. From version 1.69.0, the Elasticsearch cluster allows you to update your instance_charge_ype from `PostPaid` to `PrePaid`, the following attributes are required: `period`. But, updating from `PostPaid` to `PrePaid` is not supported.
     * 
     */
    @Export(name="instanceChargeType", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceChargeType;

    /**
     * @return Valid values are `PrePaid`, `PostPaid`. Default to `PostPaid`. From version 1.69.0, the Elasticsearch cluster allows you to update your instance_charge_ype from `PostPaid` to `PrePaid`, the following attributes are required: `period`. But, updating from `PostPaid` to `PrePaid` is not supported.
     * 
     */
    public Output<Optional<String>> instanceChargeType() {
        return Codegen.optional(this.instanceChargeType);
    }
    /**
     * Kibana console domain (Internet access supported).
     * 
     */
    @Export(name="kibanaDomain", type=String.class, parameters={})
    private Output<String> kibanaDomain;

    /**
     * @return Kibana console domain (Internet access supported).
     * 
     */
    public Output<String> kibanaDomain() {
        return this.kibanaDomain;
    }
    /**
     * The kibana node specifications of the Elasticsearch instance. Default is `elasticsearch.n4.small`.
     * 
     */
    @Export(name="kibanaNodeSpec", type=String.class, parameters={})
    private Output<String> kibanaNodeSpec;

    /**
     * @return The kibana node specifications of the Elasticsearch instance. Default is `elasticsearch.n4.small`.
     * 
     */
    public Output<String> kibanaNodeSpec() {
        return this.kibanaNodeSpec;
    }
    /**
     * Kibana console port.
     * 
     */
    @Export(name="kibanaPort", type=Integer.class, parameters={})
    private Output<Integer> kibanaPort;

    /**
     * @return Kibana console port.
     * 
     */
    public Output<Integer> kibanaPort() {
        return this.kibanaPort;
    }
    /**
     * Set the Kibana&#39;s IP whitelist in private network.
     * 
     */
    @Export(name="kibanaPrivateWhitelists", type=List.class, parameters={String.class})
    private Output<List<String>> kibanaPrivateWhitelists;

    /**
     * @return Set the Kibana&#39;s IP whitelist in private network.
     * 
     */
    public Output<List<String>> kibanaPrivateWhitelists() {
        return this.kibanaPrivateWhitelists;
    }
    /**
     * Set the Kibana&#39;s IP whitelist in internet network.
     * 
     */
    @Export(name="kibanaWhitelists", type=List.class, parameters={String.class})
    private Output<List<String>> kibanaWhitelists;

    /**
     * @return Set the Kibana&#39;s IP whitelist in internet network.
     * 
     */
    public Output<List<String>> kibanaWhitelists() {
        return this.kibanaWhitelists;
    }
    /**
     * An KMS encrypts password used to a instance. If the `password` is filled in, this field will be ignored, but you have to specify one of `password` and `kms_encrypted_password` fields.
     * 
     */
    @Export(name="kmsEncryptedPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsEncryptedPassword;

    /**
     * @return An KMS encrypts password used to a instance. If the `password` is filled in, this field will be ignored, but you have to specify one of `password` and `kms_encrypted_password` fields.
     * 
     */
    public Output<Optional<String>> kmsEncryptedPassword() {
        return Codegen.optional(this.kmsEncryptedPassword);
    }
    /**
     * An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating instance with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
     * 
     */
    @Export(name="kmsEncryptionContext", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> kmsEncryptionContext;

    /**
     * @return An KMS encryption context used to decrypt `kms_encrypted_password` before creating or updating instance with `kms_encrypted_password`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kms_encrypted_password` is set.
     * 
     */
    public Output<Optional<Map<String,Object>>> kmsEncryptionContext() {
        return Codegen.optional(this.kmsEncryptionContext);
    }
    /**
     * The dedicated master node spec. If specified, dedicated master node will be created.
     * 
     */
    @Export(name="masterNodeSpec", type=String.class, parameters={})
    private Output</* @Nullable */ String> masterNodeSpec;

    /**
     * @return The dedicated master node spec. If specified, dedicated master node will be created.
     * 
     */
    public Output<Optional<String>> masterNodeSpec() {
        return Codegen.optional(this.masterNodeSpec);
    }
    /**
     * The password of the instance. The password can be 8 to 30 characters in length and must contain three of the following conditions: uppercase letters, lowercase letters, numbers, and special characters (`!@#$%^&amp;*()_+-=`).
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output</* @Nullable */ String> password;

    /**
     * @return The password of the instance. The password can be 8 to 30 characters in length and must contain three of the following conditions: uppercase letters, lowercase letters, numbers, and special characters (`!@#$%^&amp;*()_+-=`).
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * The duration that you will buy Elasticsearch instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1. From version 1.69.2, when to modify this value, the resource can renewal a `PrePaid` instance.
     * 
     */
    @Export(name="period", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> period;

    /**
     * @return The duration that you will buy Elasticsearch instance (in month). It is valid when instance_charge_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1. From version 1.69.2, when to modify this value, the resource can renewal a `PrePaid` instance.
     * 
     */
    public Output<Optional<Integer>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * Instance connection port.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return Instance connection port.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * Set the instance&#39;s IP whitelist in VPC network.
     * 
     */
    @Export(name="privateWhitelists", type=List.class, parameters={String.class})
    private Output<List<String>> privateWhitelists;

    /**
     * @return Set the instance&#39;s IP whitelist in VPC network.
     * 
     */
    public Output<List<String>> privateWhitelists() {
        return this.privateWhitelists;
    }
    /**
     * Elasticsearch protocol. Supported values: `HTTP`, `HTTPS`.default is `HTTP`.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> protocol;

    /**
     * @return Elasticsearch protocol. Supported values: `HTTP`, `HTTPS`.default is `HTTP`.
     * 
     */
    public Output<Optional<String>> protocol() {
        return Codegen.optional(this.protocol);
    }
    /**
     * Set the instance&#39;s IP whitelist in internet network.
     * 
     */
    @Export(name="publicWhitelists", type=List.class, parameters={String.class})
    private Output<List<String>> publicWhitelists;

    /**
     * @return Set the instance&#39;s IP whitelist in internet network.
     * 
     */
    public Output<List<String>> publicWhitelists() {
        return this.publicWhitelists;
    }
    /**
     * The Id of resource group which the Elasticsearch instance belongs.
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output<String> resourceGroupId;

    /**
     * @return The Id of resource group which the Elasticsearch instance belongs.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The YML configuration of the instance.[Detailed introduction](https://www.alibabacloud.com/help/doc-detail/61336.html).
     * 
     */
    @Export(name="settingConfig", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> settingConfig;

    /**
     * @return The YML configuration of the instance.[Detailed introduction](https://www.alibabacloud.com/help/doc-detail/61336.html).
     * 
     */
    public Output<Map<String,Object>> settingConfig() {
        return this.settingConfig;
    }
    /**
     * The Elasticsearch instance status. Includes `active`, `activating`, `inactive`. Some operations are denied when status is not `active`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The Elasticsearch instance status. Includes `active`, `activating`, `inactive`. Some operations are denied when status is not `active`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A mapping of tags to assign to the resource.
     * - key: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;. It cannot contain &#34;http://&#34; and &#34;https://&#34;. It cannot be a null string.
     * - value: It can be up to 128 characters in length. It cannot contain &#34;http://&#34; and &#34;https://&#34;. It can be a null string.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * - key: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;. It cannot contain &#34;http://&#34; and &#34;https://&#34;. It cannot be a null string.
     * - value: It can be up to 128 characters in length. It cannot contain &#34;http://&#34; and &#34;https://&#34;. It can be a null string.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Elasticsearch version. Supported values: `5.5.3_with_X-Pack`, `6.3_with_X-Pack`, `6.7_with_X-Pack`, `6.8_with_X-Pack`, `7.4_with_X-Pack` and `7.7_with_X-Pack`.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Elasticsearch version. Supported values: `5.5.3_with_X-Pack`, `6.3_with_X-Pack`, `6.7_with_X-Pack`, `6.8_with_X-Pack`, `7.4_with_X-Pack` and `7.7_with_X-Pack`.
     * 
     */
    public Output<String> version() {
        return this.version;
    }
    /**
     * The ID of VSwitch.
     * 
     */
    @Export(name="vswitchId", type=String.class, parameters={})
    private Output<String> vswitchId;

    /**
     * @return The ID of VSwitch.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }
    /**
     * The Multi-AZ supported for Elasticsearch, between 1 and 3. The `data_node_amount` value must be an integral multiple of the `zone_count` value.
     * 
     */
    @Export(name="zoneCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> zoneCount;

    /**
     * @return The Multi-AZ supported for Elasticsearch, between 1 and 3. The `data_node_amount` value must be an integral multiple of the `zone_count` value.
     * 
     */
    public Output<Optional<Integer>> zoneCount() {
        return Codegen.optional(this.zoneCount);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:elasticsearch/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:elasticsearch/instance:Instance", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password"
            ))
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
