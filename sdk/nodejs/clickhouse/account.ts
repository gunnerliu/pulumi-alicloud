// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Click House Account resource.
 *
 * For information about Click House Account and how to use it, see [What is Account](https://www.alibabacloud.com/help/en/clickhouse/latest/api-clickhouse-2019-11-11-createaccount).
 *
 * > **NOTE:** Available since v1.134.0.
 *
 * ## Import
 *
 * Click House Account can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:clickhouse/account:Account example <db_cluster_id>:<account_name>
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
    public static readonly __pulumiType = 'alicloud:clickhouse/account:Account';

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
     * In Chinese, English letter. May contain Chinese and English characters, lowercase letters, numbers, and underscores (_), the dash (-). Cannot start with http:// and https:// at the beginning. Length is from 2 to 256 characters.
     */
    public readonly accountDescription!: pulumi.Output<string | undefined>;
    /**
     * Account name: lowercase letters, numbers, underscores, lowercase letter; length no more than 16 characters.
     */
    public readonly accountName!: pulumi.Output<string>;
    /**
     * The account password: uppercase letters, lowercase letters, lowercase letters, numbers, and special characters (special character! #$%^& author (s):_+-=) in a length of 8-32 bit.
     */
    public readonly accountPassword!: pulumi.Output<string>;
    /**
     * The list of databases to which you want to grant permissions. Separate databases with commas (,).
     */
    public readonly allowDatabases!: pulumi.Output<string>;
    /**
     * The list of dictionaries to which you want to grant permissions. Separate dictionaries with commas (,).
     */
    public readonly allowDictionaries!: pulumi.Output<string>;
    /**
     * The db cluster id.
     */
    public readonly dbClusterId!: pulumi.Output<string>;
    /**
     * Specifies whether to grant DDL permissions to the database account. Valid values: `true` and `false`.
     */
    public readonly ddlAuthority!: pulumi.Output<boolean>;
    /**
     * Specifies whether to grant DML permissions to the database account. Valid values: `all` and `readOnly,modify`.
     */
    public readonly dmlAuthority!: pulumi.Output<string>;
    /**
     * The status of the resource. Valid Status: `Creating`,`Available`,`Deleting`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The list of all databases. Separate databases with commas (,).
     */
    public readonly totalDatabases!: pulumi.Output<string>;
    /**
     * The list of all dictionaries. Separate dictionaries with commas (,).
     */
    public readonly totalDictionaries!: pulumi.Output<string>;
    /**
     * The type of the database account. Valid values: `Normal` or `Super`.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;

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
            resourceInputs["allowDatabases"] = state ? state.allowDatabases : undefined;
            resourceInputs["allowDictionaries"] = state ? state.allowDictionaries : undefined;
            resourceInputs["dbClusterId"] = state ? state.dbClusterId : undefined;
            resourceInputs["ddlAuthority"] = state ? state.ddlAuthority : undefined;
            resourceInputs["dmlAuthority"] = state ? state.dmlAuthority : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["totalDatabases"] = state ? state.totalDatabases : undefined;
            resourceInputs["totalDictionaries"] = state ? state.totalDictionaries : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
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
            resourceInputs["accountPassword"] = args ? args.accountPassword : undefined;
            resourceInputs["allowDatabases"] = args ? args.allowDatabases : undefined;
            resourceInputs["allowDictionaries"] = args ? args.allowDictionaries : undefined;
            resourceInputs["dbClusterId"] = args ? args.dbClusterId : undefined;
            resourceInputs["ddlAuthority"] = args ? args.ddlAuthority : undefined;
            resourceInputs["dmlAuthority"] = args ? args.dmlAuthority : undefined;
            resourceInputs["totalDatabases"] = args ? args.totalDatabases : undefined;
            resourceInputs["totalDictionaries"] = args ? args.totalDictionaries : undefined;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Account.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Account resources.
 */
export interface AccountState {
    /**
     * In Chinese, English letter. May contain Chinese and English characters, lowercase letters, numbers, and underscores (_), the dash (-). Cannot start with http:// and https:// at the beginning. Length is from 2 to 256 characters.
     */
    accountDescription?: pulumi.Input<string>;
    /**
     * Account name: lowercase letters, numbers, underscores, lowercase letter; length no more than 16 characters.
     */
    accountName?: pulumi.Input<string>;
    /**
     * The account password: uppercase letters, lowercase letters, lowercase letters, numbers, and special characters (special character! #$%^& author (s):_+-=) in a length of 8-32 bit.
     */
    accountPassword?: pulumi.Input<string>;
    /**
     * The list of databases to which you want to grant permissions. Separate databases with commas (,).
     */
    allowDatabases?: pulumi.Input<string>;
    /**
     * The list of dictionaries to which you want to grant permissions. Separate dictionaries with commas (,).
     */
    allowDictionaries?: pulumi.Input<string>;
    /**
     * The db cluster id.
     */
    dbClusterId?: pulumi.Input<string>;
    /**
     * Specifies whether to grant DDL permissions to the database account. Valid values: `true` and `false`.
     */
    ddlAuthority?: pulumi.Input<boolean>;
    /**
     * Specifies whether to grant DML permissions to the database account. Valid values: `all` and `readOnly,modify`.
     */
    dmlAuthority?: pulumi.Input<string>;
    /**
     * The status of the resource. Valid Status: `Creating`,`Available`,`Deleting`.
     */
    status?: pulumi.Input<string>;
    /**
     * The list of all databases. Separate databases with commas (,).
     */
    totalDatabases?: pulumi.Input<string>;
    /**
     * The list of all dictionaries. Separate dictionaries with commas (,).
     */
    totalDictionaries?: pulumi.Input<string>;
    /**
     * The type of the database account. Valid values: `Normal` or `Super`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Account resource.
 */
export interface AccountArgs {
    /**
     * In Chinese, English letter. May contain Chinese and English characters, lowercase letters, numbers, and underscores (_), the dash (-). Cannot start with http:// and https:// at the beginning. Length is from 2 to 256 characters.
     */
    accountDescription?: pulumi.Input<string>;
    /**
     * Account name: lowercase letters, numbers, underscores, lowercase letter; length no more than 16 characters.
     */
    accountName: pulumi.Input<string>;
    /**
     * The account password: uppercase letters, lowercase letters, lowercase letters, numbers, and special characters (special character! #$%^& author (s):_+-=) in a length of 8-32 bit.
     */
    accountPassword: pulumi.Input<string>;
    /**
     * The list of databases to which you want to grant permissions. Separate databases with commas (,).
     */
    allowDatabases?: pulumi.Input<string>;
    /**
     * The list of dictionaries to which you want to grant permissions. Separate dictionaries with commas (,).
     */
    allowDictionaries?: pulumi.Input<string>;
    /**
     * The db cluster id.
     */
    dbClusterId: pulumi.Input<string>;
    /**
     * Specifies whether to grant DDL permissions to the database account. Valid values: `true` and `false`.
     */
    ddlAuthority?: pulumi.Input<boolean>;
    /**
     * Specifies whether to grant DML permissions to the database account. Valid values: `all` and `readOnly,modify`.
     */
    dmlAuthority?: pulumi.Input<string>;
    /**
     * The list of all databases. Separate databases with commas (,).
     */
    totalDatabases?: pulumi.Input<string>;
    /**
     * The list of all dictionaries. Separate dictionaries with commas (,).
     */
    totalDictionaries?: pulumi.Input<string>;
}
