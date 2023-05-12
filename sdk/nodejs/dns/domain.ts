// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * > **DEPRECATED:** This resource has been renamed to alicloud.dns.AlidnsDomain from version 1.95.0.
 *
 * Provides a DNS resource.
 *
 * > **NOTE:** The domain name which you want to add must be already registered and had not added by another account. Every domain name can only exist in a unique group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * // Add a new Domain.
 * const dns = new alicloud.dns.Domain("dns", {groupId: "85ab8713-4a30-4de4-9d20-155ff830f651"});
 * ```
 *
 * ## Import
 *
 * DNS can be imported using the id or domain name, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:dns/domain:Domain example "aliyun.com"
 * ```
 *
 * @deprecated This resource has been deprecated in favour of DnsDomain
 */
export class Domain extends pulumi.CustomResource {
    /**
     * Get an existing Domain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DomainState, opts?: pulumi.CustomResourceOptions): Domain {
        pulumi.log.warn("Domain is deprecated: This resource has been deprecated in favour of DnsDomain")
        return new Domain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:dns/domain:Domain';

    /**
     * Returns true if the given object is an instance of Domain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Domain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Domain.__pulumiType;
    }

    /**
     * A list of the dns server name.
     */
    public /*out*/ readonly dnsServers!: pulumi.Output<string[]>;
    /**
     * The domain ID.
     */
    public /*out*/ readonly domainId!: pulumi.Output<string>;
    /**
     * Id of the group in which the domain will add. If not supplied, then use default group.
     */
    public readonly groupId!: pulumi.Output<string | undefined>;
    /**
     * Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Id of resource group which the dns belongs.
     */
    public readonly resourceGroupId!: pulumi.Output<string | undefined>;

    /**
     * Create a Domain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    /** @deprecated This resource has been deprecated in favour of DnsDomain */
    constructor(name: string, args?: DomainArgs, opts?: pulumi.CustomResourceOptions)
    /** @deprecated This resource has been deprecated in favour of DnsDomain */
    constructor(name: string, argsOrState?: DomainArgs | DomainState, opts?: pulumi.CustomResourceOptions) {
        pulumi.log.warn("Domain is deprecated: This resource has been deprecated in favour of DnsDomain")
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DomainState | undefined;
            resourceInputs["dnsServers"] = state ? state.dnsServers : undefined;
            resourceInputs["domainId"] = state ? state.domainId : undefined;
            resourceInputs["groupId"] = state ? state.groupId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
        } else {
            const args = argsOrState as DomainArgs | undefined;
            resourceInputs["groupId"] = args ? args.groupId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["dnsServers"] = undefined /*out*/;
            resourceInputs["domainId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Domain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Domain resources.
 */
export interface DomainState {
    /**
     * A list of the dns server name.
     */
    dnsServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The domain ID.
     */
    domainId?: pulumi.Input<string>;
    /**
     * Id of the group in which the domain will add. If not supplied, then use default group.
     */
    groupId?: pulumi.Input<string>;
    /**
     * Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    name?: pulumi.Input<string>;
    /**
     * The Id of resource group which the dns belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Domain resource.
 */
export interface DomainArgs {
    /**
     * Id of the group in which the domain will add. If not supplied, then use default group.
     */
    groupId?: pulumi.Input<string>;
    /**
     * Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    name?: pulumi.Input<string>;
    /**
     * The Id of resource group which the dns belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
}
