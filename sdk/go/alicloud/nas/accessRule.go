// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package nas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Nas Access Rule resource.
//
// When NAS is activated, the Default VPC Permission Group is automatically generated. It allows all IP addresses in a VPC to access the mount point with full permissions. Full permissions include Read/Write permission with no restriction on root users.
//
// > **NOTE:** Available in v1.34.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/nas"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		fooAccessGroup, err := nas.NewAccessGroup(ctx, "fooAccessGroup", &nas.AccessGroupArgs{
// 			AccessGroupName: pulumi.String("tf-NasConfigName"),
// 			AccessGroupType: pulumi.String("Vpc"),
// 			Description:     pulumi.String("tf-testAccNasConfig"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = nas.NewAccessRule(ctx, "fooAccessRule", &nas.AccessRuleArgs{
// 			AccessGroupName: fooAccessGroup.AccessGroupName,
// 			SourceCidrIp:    pulumi.String("168.1.1.0/16"),
// 			RwAccessType:    pulumi.String("RDWR"),
// 			UserAccessType:  pulumi.String("no_squash"),
// 			Priority:        pulumi.Int(2),
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
// Nas Access Rule can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:nas/accessRule:AccessRule foo tf-testAccNasConfigName:1
// ```
type AccessRule struct {
	pulumi.CustomResourceState

	// Permission group name.
	AccessGroupName pulumi.StringOutput `pulumi:"accessGroupName"`
	// The nas access rule ID.
	AccessRuleId pulumi.StringOutput `pulumi:"accessRuleId"`
	// Priority level. Range: 1-100. Default value: `1`.
	Priority pulumi.IntPtrOutput `pulumi:"priority"`
	// Read-write permission type: `RDWR` (default), `RDONLY`.
	RwAccessType pulumi.StringPtrOutput `pulumi:"rwAccessType"`
	// Address or address segment.
	SourceCidrIp pulumi.StringOutput `pulumi:"sourceCidrIp"`
	// User permission type: `noSquash` (default), `rootSquash`, `allSquash`.
	UserAccessType pulumi.StringPtrOutput `pulumi:"userAccessType"`
}

// NewAccessRule registers a new resource with the given unique name, arguments, and options.
func NewAccessRule(ctx *pulumi.Context,
	name string, args *AccessRuleArgs, opts ...pulumi.ResourceOption) (*AccessRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessGroupName == nil {
		return nil, errors.New("invalid value for required argument 'AccessGroupName'")
	}
	if args.SourceCidrIp == nil {
		return nil, errors.New("invalid value for required argument 'SourceCidrIp'")
	}
	var resource AccessRule
	err := ctx.RegisterResource("alicloud:nas/accessRule:AccessRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessRule gets an existing AccessRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessRuleState, opts ...pulumi.ResourceOption) (*AccessRule, error) {
	var resource AccessRule
	err := ctx.ReadResource("alicloud:nas/accessRule:AccessRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessRule resources.
type accessRuleState struct {
	// Permission group name.
	AccessGroupName *string `pulumi:"accessGroupName"`
	// The nas access rule ID.
	AccessRuleId *string `pulumi:"accessRuleId"`
	// Priority level. Range: 1-100. Default value: `1`.
	Priority *int `pulumi:"priority"`
	// Read-write permission type: `RDWR` (default), `RDONLY`.
	RwAccessType *string `pulumi:"rwAccessType"`
	// Address or address segment.
	SourceCidrIp *string `pulumi:"sourceCidrIp"`
	// User permission type: `noSquash` (default), `rootSquash`, `allSquash`.
	UserAccessType *string `pulumi:"userAccessType"`
}

type AccessRuleState struct {
	// Permission group name.
	AccessGroupName pulumi.StringPtrInput
	// The nas access rule ID.
	AccessRuleId pulumi.StringPtrInput
	// Priority level. Range: 1-100. Default value: `1`.
	Priority pulumi.IntPtrInput
	// Read-write permission type: `RDWR` (default), `RDONLY`.
	RwAccessType pulumi.StringPtrInput
	// Address or address segment.
	SourceCidrIp pulumi.StringPtrInput
	// User permission type: `noSquash` (default), `rootSquash`, `allSquash`.
	UserAccessType pulumi.StringPtrInput
}

func (AccessRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessRuleState)(nil)).Elem()
}

type accessRuleArgs struct {
	// Permission group name.
	AccessGroupName string `pulumi:"accessGroupName"`
	// Priority level. Range: 1-100. Default value: `1`.
	Priority *int `pulumi:"priority"`
	// Read-write permission type: `RDWR` (default), `RDONLY`.
	RwAccessType *string `pulumi:"rwAccessType"`
	// Address or address segment.
	SourceCidrIp string `pulumi:"sourceCidrIp"`
	// User permission type: `noSquash` (default), `rootSquash`, `allSquash`.
	UserAccessType *string `pulumi:"userAccessType"`
}

// The set of arguments for constructing a AccessRule resource.
type AccessRuleArgs struct {
	// Permission group name.
	AccessGroupName pulumi.StringInput
	// Priority level. Range: 1-100. Default value: `1`.
	Priority pulumi.IntPtrInput
	// Read-write permission type: `RDWR` (default), `RDONLY`.
	RwAccessType pulumi.StringPtrInput
	// Address or address segment.
	SourceCidrIp pulumi.StringInput
	// User permission type: `noSquash` (default), `rootSquash`, `allSquash`.
	UserAccessType pulumi.StringPtrInput
}

func (AccessRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessRuleArgs)(nil)).Elem()
}

type AccessRuleInput interface {
	pulumi.Input

	ToAccessRuleOutput() AccessRuleOutput
	ToAccessRuleOutputWithContext(ctx context.Context) AccessRuleOutput
}

func (*AccessRule) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessRule)(nil)).Elem()
}

func (i *AccessRule) ToAccessRuleOutput() AccessRuleOutput {
	return i.ToAccessRuleOutputWithContext(context.Background())
}

func (i *AccessRule) ToAccessRuleOutputWithContext(ctx context.Context) AccessRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessRuleOutput)
}

// AccessRuleArrayInput is an input type that accepts AccessRuleArray and AccessRuleArrayOutput values.
// You can construct a concrete instance of `AccessRuleArrayInput` via:
//
//          AccessRuleArray{ AccessRuleArgs{...} }
type AccessRuleArrayInput interface {
	pulumi.Input

	ToAccessRuleArrayOutput() AccessRuleArrayOutput
	ToAccessRuleArrayOutputWithContext(context.Context) AccessRuleArrayOutput
}

type AccessRuleArray []AccessRuleInput

func (AccessRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessRule)(nil)).Elem()
}

func (i AccessRuleArray) ToAccessRuleArrayOutput() AccessRuleArrayOutput {
	return i.ToAccessRuleArrayOutputWithContext(context.Background())
}

func (i AccessRuleArray) ToAccessRuleArrayOutputWithContext(ctx context.Context) AccessRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessRuleArrayOutput)
}

// AccessRuleMapInput is an input type that accepts AccessRuleMap and AccessRuleMapOutput values.
// You can construct a concrete instance of `AccessRuleMapInput` via:
//
//          AccessRuleMap{ "key": AccessRuleArgs{...} }
type AccessRuleMapInput interface {
	pulumi.Input

	ToAccessRuleMapOutput() AccessRuleMapOutput
	ToAccessRuleMapOutputWithContext(context.Context) AccessRuleMapOutput
}

type AccessRuleMap map[string]AccessRuleInput

func (AccessRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessRule)(nil)).Elem()
}

func (i AccessRuleMap) ToAccessRuleMapOutput() AccessRuleMapOutput {
	return i.ToAccessRuleMapOutputWithContext(context.Background())
}

func (i AccessRuleMap) ToAccessRuleMapOutputWithContext(ctx context.Context) AccessRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessRuleMapOutput)
}

type AccessRuleOutput struct{ *pulumi.OutputState }

func (AccessRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessRule)(nil)).Elem()
}

func (o AccessRuleOutput) ToAccessRuleOutput() AccessRuleOutput {
	return o
}

func (o AccessRuleOutput) ToAccessRuleOutputWithContext(ctx context.Context) AccessRuleOutput {
	return o
}

type AccessRuleArrayOutput struct{ *pulumi.OutputState }

func (AccessRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessRule)(nil)).Elem()
}

func (o AccessRuleArrayOutput) ToAccessRuleArrayOutput() AccessRuleArrayOutput {
	return o
}

func (o AccessRuleArrayOutput) ToAccessRuleArrayOutputWithContext(ctx context.Context) AccessRuleArrayOutput {
	return o
}

func (o AccessRuleArrayOutput) Index(i pulumi.IntInput) AccessRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessRule {
		return vs[0].([]*AccessRule)[vs[1].(int)]
	}).(AccessRuleOutput)
}

type AccessRuleMapOutput struct{ *pulumi.OutputState }

func (AccessRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessRule)(nil)).Elem()
}

func (o AccessRuleMapOutput) ToAccessRuleMapOutput() AccessRuleMapOutput {
	return o
}

func (o AccessRuleMapOutput) ToAccessRuleMapOutputWithContext(ctx context.Context) AccessRuleMapOutput {
	return o
}

func (o AccessRuleMapOutput) MapIndex(k pulumi.StringInput) AccessRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessRule {
		return vs[0].(map[string]*AccessRule)[vs[1].(string)]
	}).(AccessRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessRuleInput)(nil)).Elem(), &AccessRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessRuleArrayInput)(nil)).Elem(), AccessRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessRuleMapInput)(nil)).Elem(), AccessRuleMap{})
	pulumi.RegisterOutputType(AccessRuleOutput{})
	pulumi.RegisterOutputType(AccessRuleArrayOutput{})
	pulumi.RegisterOutputType(AccessRuleMapOutput{})
}
