// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Resource Manager Delegated Administrator resource.
 *
 * For information about Resource Manager Delegated Administrator and how to use it, see [What is Delegated Administrator](https://www.alibabacloud.com/help/en/resource-management/latest/registerdelegatedadministrator#doc-api-ResourceManager-RegisterDelegatedAdministrator).
 *
 * > **NOTE:** Available in v1.181.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultAccounts = alicloud.resourcemanager.getAccounts({
 *     status: "CreateSuccess",
 * });
 * const defaultDelegatedAdministrator = new alicloud.resourcemanager.DelegatedAdministrator("defaultDelegatedAdministrator", {
 *     accountId: defaultAccounts.then(defaultAccounts => defaultAccounts.accounts?.[0]?.accountId),
 *     servicePrincipal: "cloudfw.aliyuncs.com",
 * });
 * ```
 *
 * ## Import
 *
 * Resource Manager Delegated Administrator can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:resourcemanager/delegatedAdministrator:DelegatedAdministrator example <account_id>:<service_principal>
 * ```
 */
export class DelegatedAdministrator extends pulumi.CustomResource {
    /**
     * Get an existing DelegatedAdministrator resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DelegatedAdministratorState, opts?: pulumi.CustomResourceOptions): DelegatedAdministrator {
        return new DelegatedAdministrator(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:resourcemanager/delegatedAdministrator:DelegatedAdministrator';

    /**
     * Returns true if the given object is an instance of DelegatedAdministrator.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DelegatedAdministrator {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DelegatedAdministrator.__pulumiType;
    }

    /**
     * The ID of the member account in the resource directory.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The identification of the trusted service. **NOTE:** Only some trusted services support delegated administrator accounts. For more information, see [Supported trusted services](https://www.alibabacloud.com/help/en/resource-management/latest/manage-trusted-services-overview).
     */
    public readonly servicePrincipal!: pulumi.Output<string>;

    /**
     * Create a DelegatedAdministrator resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DelegatedAdministratorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DelegatedAdministratorArgs | DelegatedAdministratorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DelegatedAdministratorState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["servicePrincipal"] = state ? state.servicePrincipal : undefined;
        } else {
            const args = argsOrState as DelegatedAdministratorArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.servicePrincipal === undefined) && !opts.urn) {
                throw new Error("Missing required property 'servicePrincipal'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["servicePrincipal"] = args ? args.servicePrincipal : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DelegatedAdministrator.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DelegatedAdministrator resources.
 */
export interface DelegatedAdministratorState {
    /**
     * The ID of the member account in the resource directory.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The identification of the trusted service. **NOTE:** Only some trusted services support delegated administrator accounts. For more information, see [Supported trusted services](https://www.alibabacloud.com/help/en/resource-management/latest/manage-trusted-services-overview).
     */
    servicePrincipal?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DelegatedAdministrator resource.
 */
export interface DelegatedAdministratorArgs {
    /**
     * The ID of the member account in the resource directory.
     */
    accountId: pulumi.Input<string>;
    /**
     * The identification of the trusted service. **NOTE:** Only some trusted services support delegated administrator accounts. For more information, see [Supported trusted services](https://www.alibabacloud.com/help/en/resource-management/latest/manage-trusted-services-overview).
     */
    servicePrincipal: pulumi.Input<string>;
}
