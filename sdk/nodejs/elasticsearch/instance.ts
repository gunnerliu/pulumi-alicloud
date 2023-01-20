// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Elasticsearch instance resource. It contains data nodes, dedicated master node(optional) and etc. It can be associated with private IP whitelists and kibana IP whitelist.
 *
 * > **NOTE:** Only one operation is supported in a request. So if `dataNodeSpec` and `dataNodeDiskSize` are both changed, system will respond error.
 *
 * > **NOTE:** At present, `version` can not be modified once instance has been created.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const instance = new alicloud.elasticsearch.Instance("instance", {
 *     clientNodeAmount: 2,
 *     clientNodeSpec: "elasticsearch.sn2ne.large",
 *     dataNodeAmount: 2,
 *     dataNodeDiskSize: 20,
 *     dataNodeDiskType: "cloud_ssd",
 *     dataNodeSpec: "elasticsearch.sn2ne.large",
 *     description: "description",
 *     instanceChargeType: "PostPaid",
 *     password: "Your password",
 *     protocol: "HTTPS",
 *     tags: {
 *         key1: "value1",
 *         key2: "value2",
 *     },
 *     version: "5.5.3_with_X-Pack",
 *     vswitchId: "some vswitch id",
 *     zoneCount: 2,
 * });
 * ```
 *
 * ## Import
 *
 * Elasticsearch can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:elasticsearch/instance:Instance example es-cn-abcde123456
 * ```
 */
export class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState, opts?: pulumi.CustomResourceOptions): Instance {
        return new Instance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:elasticsearch/instance:Instance';

    /**
     * Returns true if the given object is an instance of Instance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Instance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Instance.__pulumiType;
    }

    /**
     * The Elasticsearch cluster's client node quantity, between 2 and 25.
     */
    public readonly clientNodeAmount!: pulumi.Output<number | undefined>;
    /**
     * The client node spec. If specified, client node will be created.
     */
    public readonly clientNodeSpec!: pulumi.Output<string | undefined>;
    /**
     * The Elasticsearch cluster's data node quantity, between 2 and 50.
     */
    public readonly dataNodeAmount!: pulumi.Output<number>;
    /**
     * If encrypt the data node disk. Valid values are `true`, `false`. Default to `false`.
     */
    public readonly dataNodeDiskEncrypted!: pulumi.Output<boolean | undefined>;
    /**
     * The single data node storage space.
     */
    public readonly dataNodeDiskSize!: pulumi.Output<number>;
    /**
     * The data node disk type. Supported values: cloud_ssd, cloud_efficiency.
     */
    public readonly dataNodeDiskType!: pulumi.Output<string>;
    /**
     * The data node specifications of the Elasticsearch instance.
     */
    public readonly dataNodeSpec!: pulumi.Output<string>;
    /**
     * The description of instance. It a string of 0 to 30 characters.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Instance connection domain (only VPC network access supported).
     */
    public /*out*/ readonly domain!: pulumi.Output<string>;
    /**
     * Bool, default to false. When it set to true, the instance can close kibana private network access。
     */
    public readonly enableKibanaPrivateNetwork!: pulumi.Output<boolean | undefined>;
    /**
     * Bool, default to true. When it set to false, the instance can enable kibana public network access。
     */
    public readonly enableKibanaPublicNetwork!: pulumi.Output<boolean | undefined>;
    /**
     * Bool, default to false. When it set to true, the instance can enable public network access。
     */
    public readonly enablePublic!: pulumi.Output<boolean | undefined>;
    /**
     * Valid values are `PrePaid`, `PostPaid`. Default to `PostPaid`. From version 1.69.0, the Elasticsearch cluster allows you to update your instanceChargeYpe from `PostPaid` to `PrePaid`, the following attributes are required: `period`. But, updating from `PostPaid` to `PrePaid` is not supported.
     */
    public readonly instanceChargeType!: pulumi.Output<string | undefined>;
    /**
     * Kibana console domain (Internet access supported).
     */
    public /*out*/ readonly kibanaDomain!: pulumi.Output<string>;
    /**
     * The kibana node specifications of the Elasticsearch instance. Default is `elasticsearch.n4.small`.
     */
    public readonly kibanaNodeSpec!: pulumi.Output<string>;
    /**
     * Kibana console port.
     */
    public /*out*/ readonly kibanaPort!: pulumi.Output<number>;
    /**
     * Set the Kibana's IP whitelist in private network.
     */
    public readonly kibanaPrivateWhitelists!: pulumi.Output<string[]>;
    /**
     * Set the Kibana's IP whitelist in internet network.
     */
    public readonly kibanaWhitelists!: pulumi.Output<string[]>;
    /**
     * An KMS encrypts password used to a instance. If the `password` is filled in, this field will be ignored, but you have to specify one of `password` and `kmsEncryptedPassword` fields.
     */
    public readonly kmsEncryptedPassword!: pulumi.Output<string | undefined>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating instance with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    public readonly kmsEncryptionContext!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The dedicated master node spec. If specified, dedicated master node will be created.
     */
    public readonly masterNodeSpec!: pulumi.Output<string | undefined>;
    /**
     * The password of the instance. The password can be 8 to 30 characters in length and must contain three of the following conditions: uppercase letters, lowercase letters, numbers, and special characters (`!@#$%^&*()_+-=`).
     */
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * The duration that you will buy Elasticsearch instance (in month). It is valid when instanceChargeType is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1. From version 1.69.2, when to modify this value, the resource can renewal a `PrePaid` instance.
     */
    public readonly period!: pulumi.Output<number | undefined>;
    /**
     * Instance connection port.
     */
    public /*out*/ readonly port!: pulumi.Output<number>;
    /**
     * Set the instance's IP whitelist in VPC network.
     */
    public readonly privateWhitelists!: pulumi.Output<string[]>;
    /**
     * Elasticsearch protocol. Supported values: `HTTP`, `HTTPS`.default is `HTTP`.
     */
    public readonly protocol!: pulumi.Output<string | undefined>;
    /**
     * Set the instance's IP whitelist in internet network.
     */
    public readonly publicWhitelists!: pulumi.Output<string[]>;
    /**
     * The Id of resource group which the Elasticsearch instance belongs.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * The YML configuration of the instance.[Detailed introduction](https://www.alibabacloud.com/help/doc-detail/61336.html).
     */
    public readonly settingConfig!: pulumi.Output<{[key: string]: any}>;
    /**
     * The Elasticsearch instance status. Includes `active`, `activating`, `inactive`. Some operations are denied when status is not `active`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource. 
     * - key: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:". It cannot contain "http://" and "https://". It cannot be a null string.
     * - value: It can be up to 128 characters in length. It cannot contain "http://" and "https://". It can be a null string.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Elasticsearch version. Supported values: `5.5.3_with_X-Pack`, `6.3_with_X-Pack`, `6.7_with_X-Pack`, `6.8_with_X-Pack`, `7.4_with_X-Pack` and `7.7_with_X-Pack`.
     */
    public readonly version!: pulumi.Output<string>;
    /**
     * The ID of VSwitch.
     */
    public readonly vswitchId!: pulumi.Output<string>;
    /**
     * The Multi-AZ supported for Elasticsearch, between 1 and 3. The `dataNodeAmount` value must be an integral multiple of the `zoneCount` value.
     */
    public readonly zoneCount!: pulumi.Output<number | undefined>;

    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceArgs | InstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceState | undefined;
            resourceInputs["clientNodeAmount"] = state ? state.clientNodeAmount : undefined;
            resourceInputs["clientNodeSpec"] = state ? state.clientNodeSpec : undefined;
            resourceInputs["dataNodeAmount"] = state ? state.dataNodeAmount : undefined;
            resourceInputs["dataNodeDiskEncrypted"] = state ? state.dataNodeDiskEncrypted : undefined;
            resourceInputs["dataNodeDiskSize"] = state ? state.dataNodeDiskSize : undefined;
            resourceInputs["dataNodeDiskType"] = state ? state.dataNodeDiskType : undefined;
            resourceInputs["dataNodeSpec"] = state ? state.dataNodeSpec : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["enableKibanaPrivateNetwork"] = state ? state.enableKibanaPrivateNetwork : undefined;
            resourceInputs["enableKibanaPublicNetwork"] = state ? state.enableKibanaPublicNetwork : undefined;
            resourceInputs["enablePublic"] = state ? state.enablePublic : undefined;
            resourceInputs["instanceChargeType"] = state ? state.instanceChargeType : undefined;
            resourceInputs["kibanaDomain"] = state ? state.kibanaDomain : undefined;
            resourceInputs["kibanaNodeSpec"] = state ? state.kibanaNodeSpec : undefined;
            resourceInputs["kibanaPort"] = state ? state.kibanaPort : undefined;
            resourceInputs["kibanaPrivateWhitelists"] = state ? state.kibanaPrivateWhitelists : undefined;
            resourceInputs["kibanaWhitelists"] = state ? state.kibanaWhitelists : undefined;
            resourceInputs["kmsEncryptedPassword"] = state ? state.kmsEncryptedPassword : undefined;
            resourceInputs["kmsEncryptionContext"] = state ? state.kmsEncryptionContext : undefined;
            resourceInputs["masterNodeSpec"] = state ? state.masterNodeSpec : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["privateWhitelists"] = state ? state.privateWhitelists : undefined;
            resourceInputs["protocol"] = state ? state.protocol : undefined;
            resourceInputs["publicWhitelists"] = state ? state.publicWhitelists : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["settingConfig"] = state ? state.settingConfig : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
            resourceInputs["vswitchId"] = state ? state.vswitchId : undefined;
            resourceInputs["zoneCount"] = state ? state.zoneCount : undefined;
        } else {
            const args = argsOrState as InstanceArgs | undefined;
            if ((!args || args.dataNodeAmount === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataNodeAmount'");
            }
            if ((!args || args.dataNodeDiskSize === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataNodeDiskSize'");
            }
            if ((!args || args.dataNodeDiskType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataNodeDiskType'");
            }
            if ((!args || args.dataNodeSpec === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataNodeSpec'");
            }
            if ((!args || args.version === undefined) && !opts.urn) {
                throw new Error("Missing required property 'version'");
            }
            if ((!args || args.vswitchId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vswitchId'");
            }
            resourceInputs["clientNodeAmount"] = args ? args.clientNodeAmount : undefined;
            resourceInputs["clientNodeSpec"] = args ? args.clientNodeSpec : undefined;
            resourceInputs["dataNodeAmount"] = args ? args.dataNodeAmount : undefined;
            resourceInputs["dataNodeDiskEncrypted"] = args ? args.dataNodeDiskEncrypted : undefined;
            resourceInputs["dataNodeDiskSize"] = args ? args.dataNodeDiskSize : undefined;
            resourceInputs["dataNodeDiskType"] = args ? args.dataNodeDiskType : undefined;
            resourceInputs["dataNodeSpec"] = args ? args.dataNodeSpec : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enableKibanaPrivateNetwork"] = args ? args.enableKibanaPrivateNetwork : undefined;
            resourceInputs["enableKibanaPublicNetwork"] = args ? args.enableKibanaPublicNetwork : undefined;
            resourceInputs["enablePublic"] = args ? args.enablePublic : undefined;
            resourceInputs["instanceChargeType"] = args ? args.instanceChargeType : undefined;
            resourceInputs["kibanaNodeSpec"] = args ? args.kibanaNodeSpec : undefined;
            resourceInputs["kibanaPrivateWhitelists"] = args ? args.kibanaPrivateWhitelists : undefined;
            resourceInputs["kibanaWhitelists"] = args ? args.kibanaWhitelists : undefined;
            resourceInputs["kmsEncryptedPassword"] = args ? args.kmsEncryptedPassword : undefined;
            resourceInputs["kmsEncryptionContext"] = args ? args.kmsEncryptionContext : undefined;
            resourceInputs["masterNodeSpec"] = args ? args.masterNodeSpec : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["privateWhitelists"] = args ? args.privateWhitelists : undefined;
            resourceInputs["protocol"] = args ? args.protocol : undefined;
            resourceInputs["publicWhitelists"] = args ? args.publicWhitelists : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["settingConfig"] = args ? args.settingConfig : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
            resourceInputs["vswitchId"] = args ? args.vswitchId : undefined;
            resourceInputs["zoneCount"] = args ? args.zoneCount : undefined;
            resourceInputs["domain"] = undefined /*out*/;
            resourceInputs["kibanaDomain"] = undefined /*out*/;
            resourceInputs["kibanaPort"] = undefined /*out*/;
            resourceInputs["port"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Instance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * The Elasticsearch cluster's client node quantity, between 2 and 25.
     */
    clientNodeAmount?: pulumi.Input<number>;
    /**
     * The client node spec. If specified, client node will be created.
     */
    clientNodeSpec?: pulumi.Input<string>;
    /**
     * The Elasticsearch cluster's data node quantity, between 2 and 50.
     */
    dataNodeAmount?: pulumi.Input<number>;
    /**
     * If encrypt the data node disk. Valid values are `true`, `false`. Default to `false`.
     */
    dataNodeDiskEncrypted?: pulumi.Input<boolean>;
    /**
     * The single data node storage space.
     */
    dataNodeDiskSize?: pulumi.Input<number>;
    /**
     * The data node disk type. Supported values: cloud_ssd, cloud_efficiency.
     */
    dataNodeDiskType?: pulumi.Input<string>;
    /**
     * The data node specifications of the Elasticsearch instance.
     */
    dataNodeSpec?: pulumi.Input<string>;
    /**
     * The description of instance. It a string of 0 to 30 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * Instance connection domain (only VPC network access supported).
     */
    domain?: pulumi.Input<string>;
    /**
     * Bool, default to false. When it set to true, the instance can close kibana private network access。
     */
    enableKibanaPrivateNetwork?: pulumi.Input<boolean>;
    /**
     * Bool, default to true. When it set to false, the instance can enable kibana public network access。
     */
    enableKibanaPublicNetwork?: pulumi.Input<boolean>;
    /**
     * Bool, default to false. When it set to true, the instance can enable public network access。
     */
    enablePublic?: pulumi.Input<boolean>;
    /**
     * Valid values are `PrePaid`, `PostPaid`. Default to `PostPaid`. From version 1.69.0, the Elasticsearch cluster allows you to update your instanceChargeYpe from `PostPaid` to `PrePaid`, the following attributes are required: `period`. But, updating from `PostPaid` to `PrePaid` is not supported.
     */
    instanceChargeType?: pulumi.Input<string>;
    /**
     * Kibana console domain (Internet access supported).
     */
    kibanaDomain?: pulumi.Input<string>;
    /**
     * The kibana node specifications of the Elasticsearch instance. Default is `elasticsearch.n4.small`.
     */
    kibanaNodeSpec?: pulumi.Input<string>;
    /**
     * Kibana console port.
     */
    kibanaPort?: pulumi.Input<number>;
    /**
     * Set the Kibana's IP whitelist in private network.
     */
    kibanaPrivateWhitelists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Set the Kibana's IP whitelist in internet network.
     */
    kibanaWhitelists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * An KMS encrypts password used to a instance. If the `password` is filled in, this field will be ignored, but you have to specify one of `password` and `kmsEncryptedPassword` fields.
     */
    kmsEncryptedPassword?: pulumi.Input<string>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating instance with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    kmsEncryptionContext?: pulumi.Input<{[key: string]: any}>;
    /**
     * The dedicated master node spec. If specified, dedicated master node will be created.
     */
    masterNodeSpec?: pulumi.Input<string>;
    /**
     * The password of the instance. The password can be 8 to 30 characters in length and must contain three of the following conditions: uppercase letters, lowercase letters, numbers, and special characters (`!@#$%^&*()_+-=`).
     */
    password?: pulumi.Input<string>;
    /**
     * The duration that you will buy Elasticsearch instance (in month). It is valid when instanceChargeType is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1. From version 1.69.2, when to modify this value, the resource can renewal a `PrePaid` instance.
     */
    period?: pulumi.Input<number>;
    /**
     * Instance connection port.
     */
    port?: pulumi.Input<number>;
    /**
     * Set the instance's IP whitelist in VPC network.
     */
    privateWhitelists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Elasticsearch protocol. Supported values: `HTTP`, `HTTPS`.default is `HTTP`.
     */
    protocol?: pulumi.Input<string>;
    /**
     * Set the instance's IP whitelist in internet network.
     */
    publicWhitelists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Id of resource group which the Elasticsearch instance belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The YML configuration of the instance.[Detailed introduction](https://www.alibabacloud.com/help/doc-detail/61336.html).
     */
    settingConfig?: pulumi.Input<{[key: string]: any}>;
    /**
     * The Elasticsearch instance status. Includes `active`, `activating`, `inactive`. Some operations are denied when status is not `active`.
     */
    status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource. 
     * - key: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:". It cannot contain "http://" and "https://". It cannot be a null string.
     * - value: It can be up to 128 characters in length. It cannot contain "http://" and "https://". It can be a null string.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * Elasticsearch version. Supported values: `5.5.3_with_X-Pack`, `6.3_with_X-Pack`, `6.7_with_X-Pack`, `6.8_with_X-Pack`, `7.4_with_X-Pack` and `7.7_with_X-Pack`.
     */
    version?: pulumi.Input<string>;
    /**
     * The ID of VSwitch.
     */
    vswitchId?: pulumi.Input<string>;
    /**
     * The Multi-AZ supported for Elasticsearch, between 1 and 3. The `dataNodeAmount` value must be an integral multiple of the `zoneCount` value.
     */
    zoneCount?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * The Elasticsearch cluster's client node quantity, between 2 and 25.
     */
    clientNodeAmount?: pulumi.Input<number>;
    /**
     * The client node spec. If specified, client node will be created.
     */
    clientNodeSpec?: pulumi.Input<string>;
    /**
     * The Elasticsearch cluster's data node quantity, between 2 and 50.
     */
    dataNodeAmount: pulumi.Input<number>;
    /**
     * If encrypt the data node disk. Valid values are `true`, `false`. Default to `false`.
     */
    dataNodeDiskEncrypted?: pulumi.Input<boolean>;
    /**
     * The single data node storage space.
     */
    dataNodeDiskSize: pulumi.Input<number>;
    /**
     * The data node disk type. Supported values: cloud_ssd, cloud_efficiency.
     */
    dataNodeDiskType: pulumi.Input<string>;
    /**
     * The data node specifications of the Elasticsearch instance.
     */
    dataNodeSpec: pulumi.Input<string>;
    /**
     * The description of instance. It a string of 0 to 30 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * Bool, default to false. When it set to true, the instance can close kibana private network access。
     */
    enableKibanaPrivateNetwork?: pulumi.Input<boolean>;
    /**
     * Bool, default to true. When it set to false, the instance can enable kibana public network access。
     */
    enableKibanaPublicNetwork?: pulumi.Input<boolean>;
    /**
     * Bool, default to false. When it set to true, the instance can enable public network access。
     */
    enablePublic?: pulumi.Input<boolean>;
    /**
     * Valid values are `PrePaid`, `PostPaid`. Default to `PostPaid`. From version 1.69.0, the Elasticsearch cluster allows you to update your instanceChargeYpe from `PostPaid` to `PrePaid`, the following attributes are required: `period`. But, updating from `PostPaid` to `PrePaid` is not supported.
     */
    instanceChargeType?: pulumi.Input<string>;
    /**
     * The kibana node specifications of the Elasticsearch instance. Default is `elasticsearch.n4.small`.
     */
    kibanaNodeSpec?: pulumi.Input<string>;
    /**
     * Set the Kibana's IP whitelist in private network.
     */
    kibanaPrivateWhitelists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Set the Kibana's IP whitelist in internet network.
     */
    kibanaWhitelists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * An KMS encrypts password used to a instance. If the `password` is filled in, this field will be ignored, but you have to specify one of `password` and `kmsEncryptedPassword` fields.
     */
    kmsEncryptedPassword?: pulumi.Input<string>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating instance with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    kmsEncryptionContext?: pulumi.Input<{[key: string]: any}>;
    /**
     * The dedicated master node spec. If specified, dedicated master node will be created.
     */
    masterNodeSpec?: pulumi.Input<string>;
    /**
     * The password of the instance. The password can be 8 to 30 characters in length and must contain three of the following conditions: uppercase letters, lowercase letters, numbers, and special characters (`!@#$%^&*()_+-=`).
     */
    password?: pulumi.Input<string>;
    /**
     * The duration that you will buy Elasticsearch instance (in month). It is valid when instanceChargeType is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1. From version 1.69.2, when to modify this value, the resource can renewal a `PrePaid` instance.
     */
    period?: pulumi.Input<number>;
    /**
     * Set the instance's IP whitelist in VPC network.
     */
    privateWhitelists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Elasticsearch protocol. Supported values: `HTTP`, `HTTPS`.default is `HTTP`.
     */
    protocol?: pulumi.Input<string>;
    /**
     * Set the instance's IP whitelist in internet network.
     */
    publicWhitelists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Id of resource group which the Elasticsearch instance belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The YML configuration of the instance.[Detailed introduction](https://www.alibabacloud.com/help/doc-detail/61336.html).
     */
    settingConfig?: pulumi.Input<{[key: string]: any}>;
    /**
     * A mapping of tags to assign to the resource. 
     * - key: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:". It cannot contain "http://" and "https://". It cannot be a null string.
     * - value: It can be up to 128 characters in length. It cannot contain "http://" and "https://". It can be a null string.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * Elasticsearch version. Supported values: `5.5.3_with_X-Pack`, `6.3_with_X-Pack`, `6.7_with_X-Pack`, `6.8_with_X-Pack`, `7.4_with_X-Pack` and `7.7_with_X-Pack`.
     */
    version: pulumi.Input<string>;
    /**
     * The ID of VSwitch.
     */
    vswitchId: pulumi.Input<string>;
    /**
     * The Multi-AZ supported for Elasticsearch, between 1 and 3. The `dataNodeAmount` value must be an integral multiple of the `zoneCount` value.
     */
    zoneCount?: pulumi.Input<number>;
}
