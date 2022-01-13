// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a RDS Account resource.
 *
 * For information about RDS Account and how to use it, see [What is Account](https://www.alibabacloud.com/help/en/doc-detail/26263.htm).
 *
 * > **NOTE:** Available in v1.120.0+.
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
 * const creation = config.get("creation") || "Rds";
 * const name = config.get("name") || "dbaccountmysql";
 * const defaultZones = alicloud.getZones({
 *     availableResourceCreation: creation,
 * });
 * const defaultNetwork = new alicloud.vpc.Network("defaultNetwork", {
 *     vpcName: name,
 *     cidrBlock: "172.16.0.0/16",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("defaultSwitch", {
 *     vpcId: defaultNetwork.id,
 *     cidrBlock: "172.16.0.0/24",
 *     zoneId: defaultZones.then(defaultZones => defaultZones.zones?[0]?.id),
 *     vswitchName: name,
 * });
 * const instance = new alicloud.rds.Instance("instance", {
 *     engine: "MySQL",
 *     engineVersion: "5.6",
 *     instanceType: "rds.mysql.s1.small",
 *     instanceStorage: "10",
 *     vswitchId: defaultSwitch.id,
 *     instanceName: name,
 * });
 * const account = new alicloud.rds.RdsAccount("account", {
 *     dbInstanceId: instance.id,
 *     accountName: "tftestnormal12",
 *     accountPassword: "Test12345",
 * });
 * ```
 *
 * ## Import
 *
 * RDS Account can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:rds/rdsAccount:RdsAccount example <db_instance_id>:<account_name>
 * ```
 */
export class RdsAccount extends pulumi.CustomResource {
    /**
     * Get an existing RdsAccount resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RdsAccountState, opts?: pulumi.CustomResourceOptions): RdsAccount {
        return new RdsAccount(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:rds/rdsAccount:RdsAccount';

    /**
     * Returns true if the given object is an instance of RdsAccount.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RdsAccount {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RdsAccount.__pulumiType;
    }

    /**
     * Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     */
    public readonly accountDescription!: pulumi.Output<string>;
    /**
     * Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and end with letters or numbers, The length must be 2-63 characters for PostgreSQL, otherwise the length must be 2-32 characters.
     */
    public readonly accountName!: pulumi.Output<string>;
    /**
     * Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters. You have to specify one of `password` and `kmsEncryptedPassword` fields.
     */
    public readonly accountPassword!: pulumi.Output<string>;
    /**
     * Privilege type of account. Default to `Normal`.
     * `Normal`: Common privilege.
     * `Super`: High privilege.
     */
    public readonly accountType!: pulumi.Output<string>;
    /**
     * The Id of instance in which account belongs.
     */
    public readonly dbInstanceId!: pulumi.Output<string>;
    /**
     * The attribute has been deprecated from 1.120.0 and using `accountDescription` instead.
     *
     * @deprecated Field 'description' has been deprecated from provider version 1.120.0. New field 'account_description' instead.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The attribute has been deprecated from 1.120.0 and using `dbInstanceId` instead.
     *
     * @deprecated Field 'instance_id' has been deprecated from provider version 1.120.0. New field 'db_instance_id' instead.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * An KMS encrypts password used to a db account. If the `accountPassword` is filled in, this field will be ignored.
     */
    public readonly kmsEncryptedPassword!: pulumi.Output<string | undefined>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a db account with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    public readonly kmsEncryptionContext!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The attribute has been deprecated from 1.120.0 and using `accountName` instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.120.0. New field 'account_name' instead.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The attribute has been deprecated from 1.120.0 and using `accountPassword` instead.
     *
     * @deprecated Field 'password' has been deprecated from provider version 1.120.0. New field 'account_password' instead.
     */
    public readonly password!: pulumi.Output<string>;
    /**
     * The status of the resource. Valid values: `Available`, `Unavailable`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The attribute has been deprecated from 1.120.0 and using `accountType` instead.
     *
     * @deprecated Field 'type' has been deprecated from provider version 1.120.0. New field 'account_type' instead.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a RdsAccount resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: RdsAccountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RdsAccountArgs | RdsAccountState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RdsAccountState | undefined;
            inputs["accountDescription"] = state ? state.accountDescription : undefined;
            inputs["accountName"] = state ? state.accountName : undefined;
            inputs["accountPassword"] = state ? state.accountPassword : undefined;
            inputs["accountType"] = state ? state.accountType : undefined;
            inputs["dbInstanceId"] = state ? state.dbInstanceId : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["instanceId"] = state ? state.instanceId : undefined;
            inputs["kmsEncryptedPassword"] = state ? state.kmsEncryptedPassword : undefined;
            inputs["kmsEncryptionContext"] = state ? state.kmsEncryptionContext : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["password"] = state ? state.password : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as RdsAccountArgs | undefined;
            inputs["accountDescription"] = args ? args.accountDescription : undefined;
            inputs["accountName"] = args ? args.accountName : undefined;
            inputs["accountPassword"] = args ? args.accountPassword : undefined;
            inputs["accountType"] = args ? args.accountType : undefined;
            inputs["dbInstanceId"] = args ? args.dbInstanceId : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["instanceId"] = args ? args.instanceId : undefined;
            inputs["kmsEncryptedPassword"] = args ? args.kmsEncryptedPassword : undefined;
            inputs["kmsEncryptionContext"] = args ? args.kmsEncryptionContext : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["password"] = args ? args.password : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(RdsAccount.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RdsAccount resources.
 */
export interface RdsAccountState {
    /**
     * Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     */
    accountDescription?: pulumi.Input<string>;
    /**
     * Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and end with letters or numbers, The length must be 2-63 characters for PostgreSQL, otherwise the length must be 2-32 characters.
     */
    accountName?: pulumi.Input<string>;
    /**
     * Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters. You have to specify one of `password` and `kmsEncryptedPassword` fields.
     */
    accountPassword?: pulumi.Input<string>;
    /**
     * Privilege type of account. Default to `Normal`.
     * `Normal`: Common privilege.
     * `Super`: High privilege.
     */
    accountType?: pulumi.Input<string>;
    /**
     * The Id of instance in which account belongs.
     */
    dbInstanceId?: pulumi.Input<string>;
    /**
     * The attribute has been deprecated from 1.120.0 and using `accountDescription` instead.
     *
     * @deprecated Field 'description' has been deprecated from provider version 1.120.0. New field 'account_description' instead.
     */
    description?: pulumi.Input<string>;
    /**
     * The attribute has been deprecated from 1.120.0 and using `dbInstanceId` instead.
     *
     * @deprecated Field 'instance_id' has been deprecated from provider version 1.120.0. New field 'db_instance_id' instead.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * An KMS encrypts password used to a db account. If the `accountPassword` is filled in, this field will be ignored.
     */
    kmsEncryptedPassword?: pulumi.Input<string>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a db account with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    kmsEncryptionContext?: pulumi.Input<{[key: string]: any}>;
    /**
     * The attribute has been deprecated from 1.120.0 and using `accountName` instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.120.0. New field 'account_name' instead.
     */
    name?: pulumi.Input<string>;
    /**
     * The attribute has been deprecated from 1.120.0 and using `accountPassword` instead.
     *
     * @deprecated Field 'password' has been deprecated from provider version 1.120.0. New field 'account_password' instead.
     */
    password?: pulumi.Input<string>;
    /**
     * The status of the resource. Valid values: `Available`, `Unavailable`.
     */
    status?: pulumi.Input<string>;
    /**
     * The attribute has been deprecated from 1.120.0 and using `accountType` instead.
     *
     * @deprecated Field 'type' has been deprecated from provider version 1.120.0. New field 'account_type' instead.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RdsAccount resource.
 */
export interface RdsAccountArgs {
    /**
     * Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     */
    accountDescription?: pulumi.Input<string>;
    /**
     * Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and end with letters or numbers, The length must be 2-63 characters for PostgreSQL, otherwise the length must be 2-32 characters.
     */
    accountName?: pulumi.Input<string>;
    /**
     * Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters. You have to specify one of `password` and `kmsEncryptedPassword` fields.
     */
    accountPassword?: pulumi.Input<string>;
    /**
     * Privilege type of account. Default to `Normal`.
     * `Normal`: Common privilege.
     * `Super`: High privilege.
     */
    accountType?: pulumi.Input<string>;
    /**
     * The Id of instance in which account belongs.
     */
    dbInstanceId?: pulumi.Input<string>;
    /**
     * The attribute has been deprecated from 1.120.0 and using `accountDescription` instead.
     *
     * @deprecated Field 'description' has been deprecated from provider version 1.120.0. New field 'account_description' instead.
     */
    description?: pulumi.Input<string>;
    /**
     * The attribute has been deprecated from 1.120.0 and using `dbInstanceId` instead.
     *
     * @deprecated Field 'instance_id' has been deprecated from provider version 1.120.0. New field 'db_instance_id' instead.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * An KMS encrypts password used to a db account. If the `accountPassword` is filled in, this field will be ignored.
     */
    kmsEncryptedPassword?: pulumi.Input<string>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a db account with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    kmsEncryptionContext?: pulumi.Input<{[key: string]: any}>;
    /**
     * The attribute has been deprecated from 1.120.0 and using `accountName` instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.120.0. New field 'account_name' instead.
     */
    name?: pulumi.Input<string>;
    /**
     * The attribute has been deprecated from 1.120.0 and using `accountPassword` instead.
     *
     * @deprecated Field 'password' has been deprecated from provider version 1.120.0. New field 'account_password' instead.
     */
    password?: pulumi.Input<string>;
    /**
     * The attribute has been deprecated from 1.120.0 and using `accountType` instead.
     *
     * @deprecated Field 'type' has been deprecated from provider version 1.120.0. New field 'account_type' instead.
     */
    type?: pulumi.Input<string>;
}
