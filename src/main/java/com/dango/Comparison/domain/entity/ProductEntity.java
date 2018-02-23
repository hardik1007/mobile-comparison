package com.dango.Comparison.domain.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "infyretail_product")
@TableGenerator(name = "ProductIdPkey", table = "DB_ProductIdPkeyTable", pkColumnName = "ProductIdPrimaryKey", pkColumnValue = "productId", valueColumnName = "NextValue", allocationSize = 1)
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "ProductIdPkey")
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_category")
    private String category;
    @Column(name = "product_brand")
    private String brand;
    @Column(name = "product_cost")
    private Double cost;
    @Column(name = "product_quantity")
    private Integer quantity;
    @Column(name = "product_discount")
    private Float discount;
    @Column(name = "product_sellingprice")
    private Double sellingPrice;
    @Column(name = "product_specification")
    private String specification;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_SUPPLIER_ID")
    private UserEntity supplier;
}
