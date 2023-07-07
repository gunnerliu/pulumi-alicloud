// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an Alikafka sasl user resource.
 *
 * > **NOTE:** Available since v1.66.0.
 *
 * > **NOTE:**  Only the following regions support create alikafka sasl user.
 * [`cn-hangzhou`,`cn-beijing`,`cn-shenzhen`,`cn-shanghai`,`cn-qingdao`,`cn-hongkong`,`cn-huhehaote`,`cn-zhangjiakou`,`cn-chengdu`,`cn-heyuan`,`ap-southeast-1`,`ap-southeast-3`,`ap-southeast-5`,`ap-south-1`,`ap-northeast-1`,`eu-central-1`,`eu-west-1`,`us-west-1`,`us-east-1`]
 *
 * For information about Alikafka sasl user and how to use it, see [What is Alikafka sasl user ](https://www.alibabacloud.com/help/en/message-queue-for-apache-kafka/latest/api-doc-alikafka-2019-09-16-api-doc-createsasluser).
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tf-example";
 * const defaultZones = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("defaultNetwork", {
 *     vpcName: name,
 *     cidrBlock: "10.4.0.0/16",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("defaultSwitch", {
 *     vswitchName: name,
 *     cidrBlock: "10.4.0.0/24",
 *     vpcId: defaultNetwork.id,
 *     zoneId: defaultZones.then(defaultZones => defaultZones.zones?.[0]?.id),
 * });
 * const defaultSecurityGroup = new alicloud.ecs.SecurityGroup("defaultSecurityGroup", {vpcId: defaultNetwork.id});
 * const defaultInstance = new alicloud.alikafka.Instance("defaultInstance", {
 *     partitionNum: 50,
 *     diskType: 1,
 *     diskSize: 500,
 *     deployType: 5,
 *     ioMax: 20,
 *     specType: "professional",
 *     serviceVersion: "2.2.0",
 *     config: "{\"enable.acl\":\"true\"}",
 *     vswitchId: defaultSwitch.id,
 *     securityGroup: defaultSecurityGroup.id,
 * });
 * const defaultTopic = new alicloud.alikafka.Topic("defaultTopic", {
 *     instanceId: defaultInstance.id,
 *     topic: "example-topic",
 *     remark: "topic-remark",
 * });
 * const defaultSaslUser = new alicloud.alikafka.SaslUser("defaultSaslUser", {
 *     instanceId: defaultInstance.id,
 *     username: name,
 *     password: "tf_example123",
 * });
 * ```
 *
 * ## Import
 *
 * Alikafka Sasl User can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:alikafka/saslUser:SaslUser example <instance_id>:<username>
 * ```
 */
export class SaslUser extends pulumi.CustomResource {
    /**
     * Get an existing SaslUser resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SaslUserState, opts?: pulumi.CustomResourceOptions): SaslUser {
        return new SaslUser(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:alikafka/saslUser:SaslUser';

    /**
     * Returns true if the given object is an instance of SaslUser.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SaslUser {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SaslUser.__pulumiType;
    }

    /**
     * ID of the ALIKAFKA Instance that owns the groups.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * An KMS encrypts password used to a db account. You have to specify one of `password` and `kmsEncryptedPassword` fields.
     */
    public readonly kmsEncryptedPassword!: pulumi.Output<string | undefined>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a user with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    public readonly kmsEncryptionContext!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Operation password. It may consist of letters, digits, or underlines, with a length of 1 to 64 characters. You have to specify one of `password` and `kmsEncryptedPassword` fields.
     */
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * The authentication mechanism. Valid values: `plain`, `scram`. Default value: `plain`.
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * Username for the sasl user. The length should between 1 to 64 characters. The characters can only contain 'a'-'z', 'A'-'Z', '0'-'9', '_' and '-'.
     */
    public readonly username!: pulumi.Output<string>;

    /**
     * Create a SaslUser resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SaslUserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SaslUserArgs | SaslUserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SaslUserState | undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["kmsEncryptedPassword"] = state ? state.kmsEncryptedPassword : undefined;
            resourceInputs["kmsEncryptionContext"] = state ? state.kmsEncryptionContext : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
        } else {
            const args = argsOrState as SaslUserArgs | undefined;
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            if ((!args || args.username === undefined) && !opts.urn) {
                throw new Error("Missing required property 'username'");
            }
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["kmsEncryptedPassword"] = args ? args.kmsEncryptedPassword : undefined;
            resourceInputs["kmsEncryptionContext"] = args ? args.kmsEncryptionContext : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(SaslUser.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SaslUser resources.
 */
export interface SaslUserState {
    /**
     * ID of the ALIKAFKA Instance that owns the groups.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * An KMS encrypts password used to a db account. You have to specify one of `password` and `kmsEncryptedPassword` fields.
     */
    kmsEncryptedPassword?: pulumi.Input<string>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a user with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    kmsEncryptionContext?: pulumi.Input<{[key: string]: any}>;
    /**
     * Operation password. It may consist of letters, digits, or underlines, with a length of 1 to 64 characters. You have to specify one of `password` and `kmsEncryptedPassword` fields.
     */
    password?: pulumi.Input<string>;
    /**
     * The authentication mechanism. Valid values: `plain`, `scram`. Default value: `plain`.
     */
    type?: pulumi.Input<string>;
    /**
     * Username for the sasl user. The length should between 1 to 64 characters. The characters can only contain 'a'-'z', 'A'-'Z', '0'-'9', '_' and '-'.
     */
    username?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SaslUser resource.
 */
export interface SaslUserArgs {
    /**
     * ID of the ALIKAFKA Instance that owns the groups.
     */
    instanceId: pulumi.Input<string>;
    /**
     * An KMS encrypts password used to a db account. You have to specify one of `password` and `kmsEncryptedPassword` fields.
     */
    kmsEncryptedPassword?: pulumi.Input<string>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a user with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    kmsEncryptionContext?: pulumi.Input<{[key: string]: any}>;
    /**
     * Operation password. It may consist of letters, digits, or underlines, with a length of 1 to 64 characters. You have to specify one of `password` and `kmsEncryptedPassword` fields.
     */
    password?: pulumi.Input<string>;
    /**
     * The authentication mechanism. Valid values: `plain`, `scram`. Default value: `plain`.
     */
    type?: pulumi.Input<string>;
    /**
     * Username for the sasl user. The length should between 1 to 64 characters. The characters can only contain 'a'-'z', 'A'-'Z', '0'-'9', '_' and '-'.
     */
    username: pulumi.Input<string>;
}
