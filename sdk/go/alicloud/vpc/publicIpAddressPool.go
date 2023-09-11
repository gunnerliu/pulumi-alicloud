// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Vpc Public Ip Address Pool resource.
//
// For information about Vpc Public Ip Address Pool and how to use it, see [What is Public Ip Address Pool](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/createpublicipaddresspool).
//
// > **NOTE:** Available since v1.186.0.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultResourceGroups, err := resourcemanager.GetResourceGroups(ctx, &resourcemanager.GetResourceGroupsArgs{
//				Status: pulumi.StringRef("OK"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = vpc.NewPublicIpAddressPool(ctx, "defaultPublicIpAddressPool", &vpc.PublicIpAddressPoolArgs{
//				Description:             pulumi.String(name),
//				PublicIpAddressPoolName: pulumi.String(name),
//				Isp:                     pulumi.String("BGP"),
//				ResourceGroupId:         *pulumi.String(defaultResourceGroups.Ids[0]),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Vpc Public Ip Address Pool can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:vpc/publicIpAddressPool:PublicIpAddressPool example <id>
//
// ```
type PublicIpAddressPool struct {
	pulumi.CustomResourceState

	// The creation time of the resource.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether there is a free IP address.
	IpAddressRemaining pulumi.BoolOutput `pulumi:"ipAddressRemaining"`
	// The Internet service provider. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`, `BGP_FinanceCloud`. Default Value: `BGP`.
	Isp                   pulumi.StringOutput `pulumi:"isp"`
	PublicIpAddressPoolId pulumi.StringOutput `pulumi:"publicIpAddressPoolId"`
	// The name of the VPC Public IP address pool.
	PublicIpAddressPoolName pulumi.StringPtrOutput `pulumi:"publicIpAddressPoolName"`
	// The resource group ID of the VPC Public IP address pool.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The status of the VPC Public IP address pool.
	Status pulumi.StringOutput `pulumi:"status"`
	// The tags of PrefixList.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The total number of public IP address pools.
	TotalIpNum pulumi.IntOutput `pulumi:"totalIpNum"`
	// The number of used IP addresses in the public IP address pool.
	UsedIpNum pulumi.IntOutput `pulumi:"usedIpNum"`
}

// NewPublicIpAddressPool registers a new resource with the given unique name, arguments, and options.
func NewPublicIpAddressPool(ctx *pulumi.Context,
	name string, args *PublicIpAddressPoolArgs, opts ...pulumi.ResourceOption) (*PublicIpAddressPool, error) {
	if args == nil {
		args = &PublicIpAddressPoolArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PublicIpAddressPool
	err := ctx.RegisterResource("alicloud:vpc/publicIpAddressPool:PublicIpAddressPool", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPublicIpAddressPool gets an existing PublicIpAddressPool resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPublicIpAddressPool(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PublicIpAddressPoolState, opts ...pulumi.ResourceOption) (*PublicIpAddressPool, error) {
	var resource PublicIpAddressPool
	err := ctx.ReadResource("alicloud:vpc/publicIpAddressPool:PublicIpAddressPool", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PublicIpAddressPool resources.
type publicIpAddressPoolState struct {
	// The creation time of the resource.
	CreateTime *string `pulumi:"createTime"`
	// Description.
	Description *string `pulumi:"description"`
	// Whether there is a free IP address.
	IpAddressRemaining *bool `pulumi:"ipAddressRemaining"`
	// The Internet service provider. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`, `BGP_FinanceCloud`. Default Value: `BGP`.
	Isp                   *string `pulumi:"isp"`
	PublicIpAddressPoolId *string `pulumi:"publicIpAddressPoolId"`
	// The name of the VPC Public IP address pool.
	PublicIpAddressPoolName *string `pulumi:"publicIpAddressPoolName"`
	// The resource group ID of the VPC Public IP address pool.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the VPC Public IP address pool.
	Status *string `pulumi:"status"`
	// The tags of PrefixList.
	Tags map[string]interface{} `pulumi:"tags"`
	// The total number of public IP address pools.
	TotalIpNum *int `pulumi:"totalIpNum"`
	// The number of used IP addresses in the public IP address pool.
	UsedIpNum *int `pulumi:"usedIpNum"`
}

type PublicIpAddressPoolState struct {
	// The creation time of the resource.
	CreateTime pulumi.StringPtrInput
	// Description.
	Description pulumi.StringPtrInput
	// Whether there is a free IP address.
	IpAddressRemaining pulumi.BoolPtrInput
	// The Internet service provider. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`, `BGP_FinanceCloud`. Default Value: `BGP`.
	Isp                   pulumi.StringPtrInput
	PublicIpAddressPoolId pulumi.StringPtrInput
	// The name of the VPC Public IP address pool.
	PublicIpAddressPoolName pulumi.StringPtrInput
	// The resource group ID of the VPC Public IP address pool.
	ResourceGroupId pulumi.StringPtrInput
	// The status of the VPC Public IP address pool.
	Status pulumi.StringPtrInput
	// The tags of PrefixList.
	Tags pulumi.MapInput
	// The total number of public IP address pools.
	TotalIpNum pulumi.IntPtrInput
	// The number of used IP addresses in the public IP address pool.
	UsedIpNum pulumi.IntPtrInput
}

func (PublicIpAddressPoolState) ElementType() reflect.Type {
	return reflect.TypeOf((*publicIpAddressPoolState)(nil)).Elem()
}

type publicIpAddressPoolArgs struct {
	// Description.
	Description *string `pulumi:"description"`
	// The Internet service provider. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`, `BGP_FinanceCloud`. Default Value: `BGP`.
	Isp *string `pulumi:"isp"`
	// The name of the VPC Public IP address pool.
	PublicIpAddressPoolName *string `pulumi:"publicIpAddressPoolName"`
	// The resource group ID of the VPC Public IP address pool.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The tags of PrefixList.
	Tags map[string]interface{} `pulumi:"tags"`
}

// The set of arguments for constructing a PublicIpAddressPool resource.
type PublicIpAddressPoolArgs struct {
	// Description.
	Description pulumi.StringPtrInput
	// The Internet service provider. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`, `BGP_FinanceCloud`. Default Value: `BGP`.
	Isp pulumi.StringPtrInput
	// The name of the VPC Public IP address pool.
	PublicIpAddressPoolName pulumi.StringPtrInput
	// The resource group ID of the VPC Public IP address pool.
	ResourceGroupId pulumi.StringPtrInput
	// The tags of PrefixList.
	Tags pulumi.MapInput
}

func (PublicIpAddressPoolArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*publicIpAddressPoolArgs)(nil)).Elem()
}

type PublicIpAddressPoolInput interface {
	pulumi.Input

	ToPublicIpAddressPoolOutput() PublicIpAddressPoolOutput
	ToPublicIpAddressPoolOutputWithContext(ctx context.Context) PublicIpAddressPoolOutput
}

func (*PublicIpAddressPool) ElementType() reflect.Type {
	return reflect.TypeOf((**PublicIpAddressPool)(nil)).Elem()
}

func (i *PublicIpAddressPool) ToPublicIpAddressPoolOutput() PublicIpAddressPoolOutput {
	return i.ToPublicIpAddressPoolOutputWithContext(context.Background())
}

func (i *PublicIpAddressPool) ToPublicIpAddressPoolOutputWithContext(ctx context.Context) PublicIpAddressPoolOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PublicIpAddressPoolOutput)
}

func (i *PublicIpAddressPool) ToOutput(ctx context.Context) pulumix.Output[*PublicIpAddressPool] {
	return pulumix.Output[*PublicIpAddressPool]{
		OutputState: i.ToPublicIpAddressPoolOutputWithContext(ctx).OutputState,
	}
}

// PublicIpAddressPoolArrayInput is an input type that accepts PublicIpAddressPoolArray and PublicIpAddressPoolArrayOutput values.
// You can construct a concrete instance of `PublicIpAddressPoolArrayInput` via:
//
//	PublicIpAddressPoolArray{ PublicIpAddressPoolArgs{...} }
type PublicIpAddressPoolArrayInput interface {
	pulumi.Input

	ToPublicIpAddressPoolArrayOutput() PublicIpAddressPoolArrayOutput
	ToPublicIpAddressPoolArrayOutputWithContext(context.Context) PublicIpAddressPoolArrayOutput
}

type PublicIpAddressPoolArray []PublicIpAddressPoolInput

func (PublicIpAddressPoolArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PublicIpAddressPool)(nil)).Elem()
}

func (i PublicIpAddressPoolArray) ToPublicIpAddressPoolArrayOutput() PublicIpAddressPoolArrayOutput {
	return i.ToPublicIpAddressPoolArrayOutputWithContext(context.Background())
}

func (i PublicIpAddressPoolArray) ToPublicIpAddressPoolArrayOutputWithContext(ctx context.Context) PublicIpAddressPoolArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PublicIpAddressPoolArrayOutput)
}

func (i PublicIpAddressPoolArray) ToOutput(ctx context.Context) pulumix.Output[[]*PublicIpAddressPool] {
	return pulumix.Output[[]*PublicIpAddressPool]{
		OutputState: i.ToPublicIpAddressPoolArrayOutputWithContext(ctx).OutputState,
	}
}

// PublicIpAddressPoolMapInput is an input type that accepts PublicIpAddressPoolMap and PublicIpAddressPoolMapOutput values.
// You can construct a concrete instance of `PublicIpAddressPoolMapInput` via:
//
//	PublicIpAddressPoolMap{ "key": PublicIpAddressPoolArgs{...} }
type PublicIpAddressPoolMapInput interface {
	pulumi.Input

	ToPublicIpAddressPoolMapOutput() PublicIpAddressPoolMapOutput
	ToPublicIpAddressPoolMapOutputWithContext(context.Context) PublicIpAddressPoolMapOutput
}

type PublicIpAddressPoolMap map[string]PublicIpAddressPoolInput

func (PublicIpAddressPoolMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PublicIpAddressPool)(nil)).Elem()
}

func (i PublicIpAddressPoolMap) ToPublicIpAddressPoolMapOutput() PublicIpAddressPoolMapOutput {
	return i.ToPublicIpAddressPoolMapOutputWithContext(context.Background())
}

func (i PublicIpAddressPoolMap) ToPublicIpAddressPoolMapOutputWithContext(ctx context.Context) PublicIpAddressPoolMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PublicIpAddressPoolMapOutput)
}

func (i PublicIpAddressPoolMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*PublicIpAddressPool] {
	return pulumix.Output[map[string]*PublicIpAddressPool]{
		OutputState: i.ToPublicIpAddressPoolMapOutputWithContext(ctx).OutputState,
	}
}

type PublicIpAddressPoolOutput struct{ *pulumi.OutputState }

func (PublicIpAddressPoolOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PublicIpAddressPool)(nil)).Elem()
}

func (o PublicIpAddressPoolOutput) ToPublicIpAddressPoolOutput() PublicIpAddressPoolOutput {
	return o
}

func (o PublicIpAddressPoolOutput) ToPublicIpAddressPoolOutputWithContext(ctx context.Context) PublicIpAddressPoolOutput {
	return o
}

func (o PublicIpAddressPoolOutput) ToOutput(ctx context.Context) pulumix.Output[*PublicIpAddressPool] {
	return pulumix.Output[*PublicIpAddressPool]{
		OutputState: o.OutputState,
	}
}

// The creation time of the resource.
func (o PublicIpAddressPoolOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *PublicIpAddressPool) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Description.
func (o PublicIpAddressPoolOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PublicIpAddressPool) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Whether there is a free IP address.
func (o PublicIpAddressPoolOutput) IpAddressRemaining() pulumi.BoolOutput {
	return o.ApplyT(func(v *PublicIpAddressPool) pulumi.BoolOutput { return v.IpAddressRemaining }).(pulumi.BoolOutput)
}

// The Internet service provider. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`, `BGP_FinanceCloud`. Default Value: `BGP`.
func (o PublicIpAddressPoolOutput) Isp() pulumi.StringOutput {
	return o.ApplyT(func(v *PublicIpAddressPool) pulumi.StringOutput { return v.Isp }).(pulumi.StringOutput)
}

func (o PublicIpAddressPoolOutput) PublicIpAddressPoolId() pulumi.StringOutput {
	return o.ApplyT(func(v *PublicIpAddressPool) pulumi.StringOutput { return v.PublicIpAddressPoolId }).(pulumi.StringOutput)
}

// The name of the VPC Public IP address pool.
func (o PublicIpAddressPoolOutput) PublicIpAddressPoolName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PublicIpAddressPool) pulumi.StringPtrOutput { return v.PublicIpAddressPoolName }).(pulumi.StringPtrOutput)
}

// The resource group ID of the VPC Public IP address pool.
func (o PublicIpAddressPoolOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *PublicIpAddressPool) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// The status of the VPC Public IP address pool.
func (o PublicIpAddressPoolOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *PublicIpAddressPool) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tags of PrefixList.
func (o PublicIpAddressPoolOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *PublicIpAddressPool) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

// The total number of public IP address pools.
func (o PublicIpAddressPoolOutput) TotalIpNum() pulumi.IntOutput {
	return o.ApplyT(func(v *PublicIpAddressPool) pulumi.IntOutput { return v.TotalIpNum }).(pulumi.IntOutput)
}

// The number of used IP addresses in the public IP address pool.
func (o PublicIpAddressPoolOutput) UsedIpNum() pulumi.IntOutput {
	return o.ApplyT(func(v *PublicIpAddressPool) pulumi.IntOutput { return v.UsedIpNum }).(pulumi.IntOutput)
}

type PublicIpAddressPoolArrayOutput struct{ *pulumi.OutputState }

func (PublicIpAddressPoolArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PublicIpAddressPool)(nil)).Elem()
}

func (o PublicIpAddressPoolArrayOutput) ToPublicIpAddressPoolArrayOutput() PublicIpAddressPoolArrayOutput {
	return o
}

func (o PublicIpAddressPoolArrayOutput) ToPublicIpAddressPoolArrayOutputWithContext(ctx context.Context) PublicIpAddressPoolArrayOutput {
	return o
}

func (o PublicIpAddressPoolArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*PublicIpAddressPool] {
	return pulumix.Output[[]*PublicIpAddressPool]{
		OutputState: o.OutputState,
	}
}

func (o PublicIpAddressPoolArrayOutput) Index(i pulumi.IntInput) PublicIpAddressPoolOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PublicIpAddressPool {
		return vs[0].([]*PublicIpAddressPool)[vs[1].(int)]
	}).(PublicIpAddressPoolOutput)
}

type PublicIpAddressPoolMapOutput struct{ *pulumi.OutputState }

func (PublicIpAddressPoolMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PublicIpAddressPool)(nil)).Elem()
}

func (o PublicIpAddressPoolMapOutput) ToPublicIpAddressPoolMapOutput() PublicIpAddressPoolMapOutput {
	return o
}

func (o PublicIpAddressPoolMapOutput) ToPublicIpAddressPoolMapOutputWithContext(ctx context.Context) PublicIpAddressPoolMapOutput {
	return o
}

func (o PublicIpAddressPoolMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*PublicIpAddressPool] {
	return pulumix.Output[map[string]*PublicIpAddressPool]{
		OutputState: o.OutputState,
	}
}

func (o PublicIpAddressPoolMapOutput) MapIndex(k pulumi.StringInput) PublicIpAddressPoolOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PublicIpAddressPool {
		return vs[0].(map[string]*PublicIpAddressPool)[vs[1].(string)]
	}).(PublicIpAddressPoolOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PublicIpAddressPoolInput)(nil)).Elem(), &PublicIpAddressPool{})
	pulumi.RegisterInputType(reflect.TypeOf((*PublicIpAddressPoolArrayInput)(nil)).Elem(), PublicIpAddressPoolArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PublicIpAddressPoolMapInput)(nil)).Elem(), PublicIpAddressPoolMap{})
	pulumi.RegisterOutputType(PublicIpAddressPoolOutput{})
	pulumi.RegisterOutputType(PublicIpAddressPoolArrayOutput{})
	pulumi.RegisterOutputType(PublicIpAddressPoolMapOutput{})
}
