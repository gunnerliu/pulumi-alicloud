// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a PolarDB account resource and used to manage databases.
 *
 * > **NOTE:** Available in v1.67.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const creation = config.get("creation") || "PolarDB";
 * const name = config.get("name") || "polardbaccountmysql";
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
 *     zoneId: defaultZones.then(defaultZones => defaultZones.zones?.[0]?.id),
 *     vswitchName: name,
 * });
 * const cluster = new alicloud.polardb.Cluster("cluster", {
 *     dbType: "MySQL",
 *     dbVersion: "8.0",
 *     dbNodeClass: "polar.mysql.x4.large",
 *     payType: "PostPaid",
 *     vswitchId: defaultSwitch.id,
 *     description: name,
 * });
 * const account = new alicloud.polardb.Account("account", {
 *     dbClusterId: cluster.id,
 *     accountName: "tftestnormal",
 *     accountPassword: "Test12345",
 *     accountDescription: name,
 * });
 * ```
 *
 * ## Import
 *
 * PolarDB account can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:polardb/account:Account example "pc-12345:tf_account"
 * ```
 */
export class Account extends pulumi.CustomResource {
    /**
     * Get an existing Account resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountState, opts?: pulumi.CustomResourceOptions): Account {
        return new Account(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:polardb/account:Account';

    /**
     * Returns true if the given object is an instance of Account.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Account {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Account.__pulumiType;
    }

    /**
     * Account description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     */
    public readonly accountDescription!: pulumi.Output<string | undefined>;
    /**
     * Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
     */
    public readonly accountName!: pulumi.Output<string>;
    /**
     * Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters.
     */
    public readonly accountPassword!: pulumi.Output<string>;
    /**
     * Account type, Valid values are `Normal`, `Super`, Default to `Normal`.
     */
    public readonly accountType!: pulumi.Output<string | undefined>;
    /**
     * The Id of cluster in which account belongs.
     */
    public readonly dbClusterId!: pulumi.Output<string>;
    /**
     * An KMS encrypts password used to a db account. If the `accountPassword` is filled in, this field will be ignored.
     */
    public readonly kmsEncryptedPassword!: pulumi.Output<string | undefined>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a db account with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    public readonly kmsEncryptionContext!: pulumi.Output<{[key: string]: any} | undefined>;

    /**
     * Create a Account resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccountArgs | AccountState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccountState | undefined;
            resourceInputs["accountDescription"] = state ? state.accountDescription : undefined;
            resourceInputs["accountName"] = state ? state.accountName : undefined;
            resourceInputs["accountPassword"] = state ? state.accountPassword : undefined;
            resourceInputs["accountType"] = state ? state.accountType : undefined;
            resourceInputs["dbClusterId"] = state ? state.dbClusterId : undefined;
            resourceInputs["kmsEncryptedPassword"] = state ? state.kmsEncryptedPassword : undefined;
            resourceInputs["kmsEncryptionContext"] = state ? state.kmsEncryptionContext : undefined;
        } else {
            const args = argsOrState as AccountArgs | undefined;
            if ((!args || args.accountName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountName'");
            }
            if ((!args || args.accountPassword === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountPassword'");
            }
            if ((!args || args.dbClusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbClusterId'");
            }
            resourceInputs["accountDescription"] = args ? args.accountDescription : undefined;
            resourceInputs["accountName"] = args ? args.accountName : undefined;
            resourceInputs["accountPassword"] = args?.accountPassword ? pulumi.secret(args.accountPassword) : undefined;
            resourceInputs["accountType"] = args ? args.accountType : undefined;
            resourceInputs["dbClusterId"] = args ? args.dbClusterId : undefined;
            resourceInputs["kmsEncryptedPassword"] = args ? args.kmsEncryptedPassword : undefined;
            resourceInputs["kmsEncryptionContext"] = args ? args.kmsEncryptionContext : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["accountPassword"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Account.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Account resources.
 */
export interface AccountState {
    /**
     * Account description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     */
    accountDescription?: pulumi.Input<string>;
    /**
     * Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
     */
    accountName?: pulumi.Input<string>;
    /**
     * Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters.
     */
    accountPassword?: pulumi.Input<string>;
    /**
     * Account type, Valid values are `Normal`, `Super`, Default to `Normal`.
     */
    accountType?: pulumi.Input<string>;
    /**
     * The Id of cluster in which account belongs.
     */
    dbClusterId?: pulumi.Input<string>;
    /**
     * An KMS encrypts password used to a db account. If the `accountPassword` is filled in, this field will be ignored.
     */
    kmsEncryptedPassword?: pulumi.Input<string>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a db account with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    kmsEncryptionContext?: pulumi.Input<{[key: string]: any}>;
}

/**
 * The set of arguments for constructing a Account resource.
 */
export interface AccountArgs {
    /**
     * Account description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     */
    accountDescription?: pulumi.Input<string>;
    /**
     * Operation account requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter and have no more than 16 characters.
     */
    accountName: pulumi.Input<string>;
    /**
     * Operation password. It may consist of letters, digits, or underlines, with a length of 6 to 32 characters.
     */
    accountPassword: pulumi.Input<string>;
    /**
     * Account type, Valid values are `Normal`, `Super`, Default to `Normal`.
     */
    accountType?: pulumi.Input<string>;
    /**
     * The Id of cluster in which account belongs.
     */
    dbClusterId: pulumi.Input<string>;
    /**
     * An KMS encrypts password used to a db account. If the `accountPassword` is filled in, this field will be ignored.
     */
    kmsEncryptedPassword?: pulumi.Input<string>;
    /**
     * An KMS encryption context used to decrypt `kmsEncryptedPassword` before creating or updating a db account with `kmsEncryptedPassword`. See [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm). It is valid when `kmsEncryptedPassword` is set.
     */
    kmsEncryptionContext?: pulumi.Input<{[key: string]: any}>;
}
