// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a PolarDB account privilege resource and used to grant several database some access privilege. A database can be granted by multiple account.
 *
 * > **NOTE:** Available in v1.67.0+.
 *
 * ## Import
 *
 * PolarDB account privilege can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:polardb/accountPrivilege:AccountPrivilege example "pc-12345:tf_account:ReadOnly"
 * ```
 */
export class AccountPrivilege extends pulumi.CustomResource {
    /**
     * Get an existing AccountPrivilege resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountPrivilegeState, opts?: pulumi.CustomResourceOptions): AccountPrivilege {
        return new AccountPrivilege(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:polardb/accountPrivilege:AccountPrivilege';

    /**
     * Returns true if the given object is an instance of AccountPrivilege.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccountPrivilege {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccountPrivilege.__pulumiType;
    }

    /**
     * A specified account name.
     */
    public readonly accountName!: pulumi.Output<string>;
    /**
     * The privilege of one account access database. Valid values: ["ReadOnly", "ReadWrite"], ["DMLOnly", "DDLOnly"] added since version v1.101.0. Default to "ReadOnly".
     */
    public readonly accountPrivilege!: pulumi.Output<string | undefined>;
    /**
     * The Id of cluster in which account belongs.
     */
    public readonly dbClusterId!: pulumi.Output<string>;
    /**
     * List of specified database name.
     */
    public readonly dbNames!: pulumi.Output<string[]>;

    /**
     * Create a AccountPrivilege resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccountPrivilegeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccountPrivilegeArgs | AccountPrivilegeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccountPrivilegeState | undefined;
            resourceInputs["accountName"] = state ? state.accountName : undefined;
            resourceInputs["accountPrivilege"] = state ? state.accountPrivilege : undefined;
            resourceInputs["dbClusterId"] = state ? state.dbClusterId : undefined;
            resourceInputs["dbNames"] = state ? state.dbNames : undefined;
        } else {
            const args = argsOrState as AccountPrivilegeArgs | undefined;
            if ((!args || args.accountName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountName'");
            }
            if ((!args || args.dbClusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbClusterId'");
            }
            if ((!args || args.dbNames === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbNames'");
            }
            resourceInputs["accountName"] = args ? args.accountName : undefined;
            resourceInputs["accountPrivilege"] = args ? args.accountPrivilege : undefined;
            resourceInputs["dbClusterId"] = args ? args.dbClusterId : undefined;
            resourceInputs["dbNames"] = args ? args.dbNames : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccountPrivilege.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccountPrivilege resources.
 */
export interface AccountPrivilegeState {
    /**
     * A specified account name.
     */
    accountName?: pulumi.Input<string>;
    /**
     * The privilege of one account access database. Valid values: ["ReadOnly", "ReadWrite"], ["DMLOnly", "DDLOnly"] added since version v1.101.0. Default to "ReadOnly".
     */
    accountPrivilege?: pulumi.Input<string>;
    /**
     * The Id of cluster in which account belongs.
     */
    dbClusterId?: pulumi.Input<string>;
    /**
     * List of specified database name.
     */
    dbNames?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a AccountPrivilege resource.
 */
export interface AccountPrivilegeArgs {
    /**
     * A specified account name.
     */
    accountName: pulumi.Input<string>;
    /**
     * The privilege of one account access database. Valid values: ["ReadOnly", "ReadWrite"], ["DMLOnly", "DDLOnly"] added since version v1.101.0. Default to "ReadOnly".
     */
    accountPrivilege?: pulumi.Input<string>;
    /**
     * The Id of cluster in which account belongs.
     */
    dbClusterId: pulumi.Input<string>;
    /**
     * List of specified database name.
     */
    dbNames: pulumi.Input<pulumi.Input<string>[]>;
}
