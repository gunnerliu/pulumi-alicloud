// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package yundun

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Cloud DBaudit instance resource ("Yundun_dbaudit" is the short term of this product).
//
// > **NOTE:** The endpoint of bssopenapi used only support "business.aliyuncs.com" at present.
//
// > **NOTE:** Available in 1.62.0+ .
//
// > **NOTE:** In order to destroy Cloud DBaudit instance , users are required to apply for white list first
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/yundun"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := yundun.NewDBAuditInstance(ctx, "default", &yundun.DBAuditInstanceArgs{
// 			Description: pulumi.String("Terraform-test"),
// 			Period:      pulumi.Int(1),
// 			PlanCode:    pulumi.String("alpha.professional"),
// 			VswitchId:   pulumi.String("v-testVswitch"),
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
// Yundun_dbaudit instance can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:yundun/dBAuditInstance:DBAuditInstance example dbaudit-exampe123456
// ```
type DBAuditInstance struct {
	pulumi.CustomResourceState

	// Description of the instance. This name can have a string of 1 to 63 characters.
	Description pulumi.StringOutput `pulumi:"description"`
	Period      pulumi.IntPtrOutput `pulumi:"period"`
	// Plan code of the Cloud DBAudit to produce. (alpha.professional, alpha.basic, alpha.premium)
	PlanCode pulumi.StringOutput `pulumi:"planCode"`
	// The Id of resource group which the DBaudit Instance belongs. If not set, the resource is created in the default resource group.
	ResourceGroupId pulumi.StringPtrOutput `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// vSwtich ID configured to audit
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
}

// NewDBAuditInstance registers a new resource with the given unique name, arguments, and options.
func NewDBAuditInstance(ctx *pulumi.Context,
	name string, args *DBAuditInstanceArgs, opts ...pulumi.ResourceOption) (*DBAuditInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.PlanCode == nil {
		return nil, errors.New("invalid value for required argument 'PlanCode'")
	}
	if args.VswitchId == nil {
		return nil, errors.New("invalid value for required argument 'VswitchId'")
	}
	var resource DBAuditInstance
	err := ctx.RegisterResource("alicloud:yundun/dBAuditInstance:DBAuditInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDBAuditInstance gets an existing DBAuditInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDBAuditInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DBAuditInstanceState, opts ...pulumi.ResourceOption) (*DBAuditInstance, error) {
	var resource DBAuditInstance
	err := ctx.ReadResource("alicloud:yundun/dBAuditInstance:DBAuditInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DBAuditInstance resources.
type dbauditInstanceState struct {
	// Description of the instance. This name can have a string of 1 to 63 characters.
	Description *string `pulumi:"description"`
	Period      *int    `pulumi:"period"`
	// Plan code of the Cloud DBAudit to produce. (alpha.professional, alpha.basic, alpha.premium)
	PlanCode *string `pulumi:"planCode"`
	// The Id of resource group which the DBaudit Instance belongs. If not set, the resource is created in the default resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// vSwtich ID configured to audit
	VswitchId *string `pulumi:"vswitchId"`
}

type DBAuditInstanceState struct {
	// Description of the instance. This name can have a string of 1 to 63 characters.
	Description pulumi.StringPtrInput
	Period      pulumi.IntPtrInput
	// Plan code of the Cloud DBAudit to produce. (alpha.professional, alpha.basic, alpha.premium)
	PlanCode pulumi.StringPtrInput
	// The Id of resource group which the DBaudit Instance belongs. If not set, the resource is created in the default resource group.
	ResourceGroupId pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// vSwtich ID configured to audit
	VswitchId pulumi.StringPtrInput
}

func (DBAuditInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*dbauditInstanceState)(nil)).Elem()
}

type dbauditInstanceArgs struct {
	// Description of the instance. This name can have a string of 1 to 63 characters.
	Description string `pulumi:"description"`
	Period      *int   `pulumi:"period"`
	// Plan code of the Cloud DBAudit to produce. (alpha.professional, alpha.basic, alpha.premium)
	PlanCode string `pulumi:"planCode"`
	// The Id of resource group which the DBaudit Instance belongs. If not set, the resource is created in the default resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// vSwtich ID configured to audit
	VswitchId string `pulumi:"vswitchId"`
}

// The set of arguments for constructing a DBAuditInstance resource.
type DBAuditInstanceArgs struct {
	// Description of the instance. This name can have a string of 1 to 63 characters.
	Description pulumi.StringInput
	Period      pulumi.IntPtrInput
	// Plan code of the Cloud DBAudit to produce. (alpha.professional, alpha.basic, alpha.premium)
	PlanCode pulumi.StringInput
	// The Id of resource group which the DBaudit Instance belongs. If not set, the resource is created in the default resource group.
	ResourceGroupId pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// vSwtich ID configured to audit
	VswitchId pulumi.StringInput
}

func (DBAuditInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dbauditInstanceArgs)(nil)).Elem()
}

type DBAuditInstanceInput interface {
	pulumi.Input

	ToDBAuditInstanceOutput() DBAuditInstanceOutput
	ToDBAuditInstanceOutputWithContext(ctx context.Context) DBAuditInstanceOutput
}

func (*DBAuditInstance) ElementType() reflect.Type {
	return reflect.TypeOf((**DBAuditInstance)(nil)).Elem()
}

func (i *DBAuditInstance) ToDBAuditInstanceOutput() DBAuditInstanceOutput {
	return i.ToDBAuditInstanceOutputWithContext(context.Background())
}

func (i *DBAuditInstance) ToDBAuditInstanceOutputWithContext(ctx context.Context) DBAuditInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DBAuditInstanceOutput)
}

// DBAuditInstanceArrayInput is an input type that accepts DBAuditInstanceArray and DBAuditInstanceArrayOutput values.
// You can construct a concrete instance of `DBAuditInstanceArrayInput` via:
//
//          DBAuditInstanceArray{ DBAuditInstanceArgs{...} }
type DBAuditInstanceArrayInput interface {
	pulumi.Input

	ToDBAuditInstanceArrayOutput() DBAuditInstanceArrayOutput
	ToDBAuditInstanceArrayOutputWithContext(context.Context) DBAuditInstanceArrayOutput
}

type DBAuditInstanceArray []DBAuditInstanceInput

func (DBAuditInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DBAuditInstance)(nil)).Elem()
}

func (i DBAuditInstanceArray) ToDBAuditInstanceArrayOutput() DBAuditInstanceArrayOutput {
	return i.ToDBAuditInstanceArrayOutputWithContext(context.Background())
}

func (i DBAuditInstanceArray) ToDBAuditInstanceArrayOutputWithContext(ctx context.Context) DBAuditInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DBAuditInstanceArrayOutput)
}

// DBAuditInstanceMapInput is an input type that accepts DBAuditInstanceMap and DBAuditInstanceMapOutput values.
// You can construct a concrete instance of `DBAuditInstanceMapInput` via:
//
//          DBAuditInstanceMap{ "key": DBAuditInstanceArgs{...} }
type DBAuditInstanceMapInput interface {
	pulumi.Input

	ToDBAuditInstanceMapOutput() DBAuditInstanceMapOutput
	ToDBAuditInstanceMapOutputWithContext(context.Context) DBAuditInstanceMapOutput
}

type DBAuditInstanceMap map[string]DBAuditInstanceInput

func (DBAuditInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DBAuditInstance)(nil)).Elem()
}

func (i DBAuditInstanceMap) ToDBAuditInstanceMapOutput() DBAuditInstanceMapOutput {
	return i.ToDBAuditInstanceMapOutputWithContext(context.Background())
}

func (i DBAuditInstanceMap) ToDBAuditInstanceMapOutputWithContext(ctx context.Context) DBAuditInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DBAuditInstanceMapOutput)
}

type DBAuditInstanceOutput struct{ *pulumi.OutputState }

func (DBAuditInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DBAuditInstance)(nil)).Elem()
}

func (o DBAuditInstanceOutput) ToDBAuditInstanceOutput() DBAuditInstanceOutput {
	return o
}

func (o DBAuditInstanceOutput) ToDBAuditInstanceOutputWithContext(ctx context.Context) DBAuditInstanceOutput {
	return o
}

type DBAuditInstanceArrayOutput struct{ *pulumi.OutputState }

func (DBAuditInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DBAuditInstance)(nil)).Elem()
}

func (o DBAuditInstanceArrayOutput) ToDBAuditInstanceArrayOutput() DBAuditInstanceArrayOutput {
	return o
}

func (o DBAuditInstanceArrayOutput) ToDBAuditInstanceArrayOutputWithContext(ctx context.Context) DBAuditInstanceArrayOutput {
	return o
}

func (o DBAuditInstanceArrayOutput) Index(i pulumi.IntInput) DBAuditInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DBAuditInstance {
		return vs[0].([]*DBAuditInstance)[vs[1].(int)]
	}).(DBAuditInstanceOutput)
}

type DBAuditInstanceMapOutput struct{ *pulumi.OutputState }

func (DBAuditInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DBAuditInstance)(nil)).Elem()
}

func (o DBAuditInstanceMapOutput) ToDBAuditInstanceMapOutput() DBAuditInstanceMapOutput {
	return o
}

func (o DBAuditInstanceMapOutput) ToDBAuditInstanceMapOutputWithContext(ctx context.Context) DBAuditInstanceMapOutput {
	return o
}

func (o DBAuditInstanceMapOutput) MapIndex(k pulumi.StringInput) DBAuditInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DBAuditInstance {
		return vs[0].(map[string]*DBAuditInstance)[vs[1].(string)]
	}).(DBAuditInstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DBAuditInstanceInput)(nil)).Elem(), &DBAuditInstance{})
	pulumi.RegisterInputType(reflect.TypeOf((*DBAuditInstanceArrayInput)(nil)).Elem(), DBAuditInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DBAuditInstanceMapInput)(nil)).Elem(), DBAuditInstanceMap{})
	pulumi.RegisterOutputType(DBAuditInstanceOutput{})
	pulumi.RegisterOutputType(DBAuditInstanceArrayOutput{})
	pulumi.RegisterOutputType(DBAuditInstanceMapOutput{})
}
