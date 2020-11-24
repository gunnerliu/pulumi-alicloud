// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Alidns Domain Group resource. For information about Alidns Domain Group and how to use it, see [What is Resource Alidns Domain Group](https://www.alibabacloud.com/help/en/doc-detail/29762.htm).
//
// > **NOTE:** Available in v1.84.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/dns"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := dns.NewDomainGroup(ctx, "example", &dns.DomainGroupArgs{
// 			DomainGroupName: pulumi.String("tf-testDG"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Alidns domain group can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:dns/domainGroup:DomainGroup example 0932eb3ddee7499085c4d13d45*****
// ```
type DomainGroup struct {
	pulumi.CustomResourceState

	// Name of the domain group.
	DomainGroupName pulumi.StringOutput `pulumi:"domainGroupName"`
	// Replaced by `domainGroupName` after version 1.97.0.
	//
	// Deprecated: Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.
	GroupName pulumi.StringOutput `pulumi:"groupName"`
	// User language.
	Lang pulumi.StringPtrOutput `pulumi:"lang"`
}

// NewDomainGroup registers a new resource with the given unique name, arguments, and options.
func NewDomainGroup(ctx *pulumi.Context,
	name string, args *DomainGroupArgs, opts ...pulumi.ResourceOption) (*DomainGroup, error) {
	if args == nil {
		args = &DomainGroupArgs{}
	}
	var resource DomainGroup
	err := ctx.RegisterResource("alicloud:dns/domainGroup:DomainGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDomainGroup gets an existing DomainGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDomainGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DomainGroupState, opts ...pulumi.ResourceOption) (*DomainGroup, error) {
	var resource DomainGroup
	err := ctx.ReadResource("alicloud:dns/domainGroup:DomainGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DomainGroup resources.
type domainGroupState struct {
	// Name of the domain group.
	DomainGroupName *string `pulumi:"domainGroupName"`
	// Replaced by `domainGroupName` after version 1.97.0.
	//
	// Deprecated: Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.
	GroupName *string `pulumi:"groupName"`
	// User language.
	Lang *string `pulumi:"lang"`
}

type DomainGroupState struct {
	// Name of the domain group.
	DomainGroupName pulumi.StringPtrInput
	// Replaced by `domainGroupName` after version 1.97.0.
	//
	// Deprecated: Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.
	GroupName pulumi.StringPtrInput
	// User language.
	Lang pulumi.StringPtrInput
}

func (DomainGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*domainGroupState)(nil)).Elem()
}

type domainGroupArgs struct {
	// Name of the domain group.
	DomainGroupName *string `pulumi:"domainGroupName"`
	// Replaced by `domainGroupName` after version 1.97.0.
	//
	// Deprecated: Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.
	GroupName *string `pulumi:"groupName"`
	// User language.
	Lang *string `pulumi:"lang"`
}

// The set of arguments for constructing a DomainGroup resource.
type DomainGroupArgs struct {
	// Name of the domain group.
	DomainGroupName pulumi.StringPtrInput
	// Replaced by `domainGroupName` after version 1.97.0.
	//
	// Deprecated: Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.
	GroupName pulumi.StringPtrInput
	// User language.
	Lang pulumi.StringPtrInput
}

func (DomainGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*domainGroupArgs)(nil)).Elem()
}

type DomainGroupInput interface {
	pulumi.Input

	ToDomainGroupOutput() DomainGroupOutput
	ToDomainGroupOutputWithContext(ctx context.Context) DomainGroupOutput
}

func (DomainGroup) ElementType() reflect.Type {
	return reflect.TypeOf((*DomainGroup)(nil)).Elem()
}

func (i DomainGroup) ToDomainGroupOutput() DomainGroupOutput {
	return i.ToDomainGroupOutputWithContext(context.Background())
}

func (i DomainGroup) ToDomainGroupOutputWithContext(ctx context.Context) DomainGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainGroupOutput)
}

type DomainGroupOutput struct {
	*pulumi.OutputState
}

func (DomainGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DomainGroupOutput)(nil)).Elem()
}

func (o DomainGroupOutput) ToDomainGroupOutput() DomainGroupOutput {
	return o
}

func (o DomainGroupOutput) ToDomainGroupOutputWithContext(ctx context.Context) DomainGroupOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(DomainGroupOutput{})
}
